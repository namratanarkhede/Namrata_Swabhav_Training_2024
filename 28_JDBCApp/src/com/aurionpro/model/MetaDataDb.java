package com.aurionpro.model;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MetaDataDb {

    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedStatements = null;

    public void connectToDb() {
        try {
            // 1. Register Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Create Connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb", "root", "root");

            // Get DatabaseMetaData
            DatabaseMetaData metaData = connection.getMetaData();

            // Display General Database Information
            System.out.println("Database Product Name: " + metaData.getDatabaseProductName());
            System.out.println("Database Product Version: " + metaData.getDatabaseProductVersion());
            System.out.println("Driver Name: " + metaData.getDriverName());
            System.out.println("Driver Version: " + metaData.getDriverVersion());
            System.out.println("Database Connection Information: " + metaData.getConnection());
            System.out.println("Database User Name: " + metaData.getUserName());
            System.out.println("Database URL Information: " + metaData.getURL());

            System.out.println("Connection Successful");

            // Specify the table name which we want.
            String tableName = "user";

            // Get table metadata
            getTableMetadata(metaData, tableName);

            // Get column metadata
            getColumnMetadata(metaData, tableName);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to get metadata of a specific table
    private void getTableMetadata(DatabaseMetaData metaData, String tableName) throws SQLException {
        try (ResultSet tables = metaData.getTables(null, null, tableName, new String[]{"TABLE"})) {
            if (tables.next()) {
                String tableCat = tables.getString("TABLE_CAT");
                String tableSchem = tables.getString("TABLE_SCHEM");
                String tableNameFromMeta = tables.getString("TABLE_NAME");
                String tableType = tables.getString("TABLE_TYPE");
                String remarks = tables.getString("REMARKS");

                System.out.println("\nTable Metadata:");
                System.out.println("Catalog: " + tableCat);
                System.out.println("Schema: " + tableSchem);
                System.out.println("Table Name: " + tableNameFromMeta);
                System.out.println("Table Type: " + tableType);
                System.out.println("Remarks: " + remarks);
            } else {
                System.out.println("Table " + tableName + " not found.");
            }
        }
    }

    // Method to get metadata of columns of a specific table
    private void getColumnMetadata(DatabaseMetaData metaData, String tableName) throws SQLException {
        try (ResultSet columns = metaData.getColumns(null, null, tableName, null)) {
            System.out.println("\nColumn Metadata for table " + tableName + ":");

            while (columns.next()) {
                String columnName = columns.getString("COLUMN_NAME");
                int columnSize = columns.getInt("COLUMN_SIZE");
                String dataType = columns.getString("DATA_TYPE");
                String dataTypeName = columns.getString("TYPE_NAME");
                String isNullable = columns.getString("IS_NULLABLE");
                String isAutoIncrement = columns.getString("IS_AUTOINCREMENT");

                System.out.println("Column Name: " + columnName);
                System.out.println("Column Size: " + columnSize);
                System.out.println("Data Type: " + dataType + " (" + dataTypeName + ")");
                System.out.println("Is Nullable: " + isNullable);
                System.out.println("Is Auto Increment: " + isAutoIncrement);
                System.out.println("-------------------------");
            }
        }
    }

    public static void main(String[] args) {
        MetaDataDb metaDataDb = new MetaDataDb();
        metaDataDb.connectToDb();
    }
}
