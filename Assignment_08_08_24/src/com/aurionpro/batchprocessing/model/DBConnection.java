package com.aurionpro.batchprocessing.model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBConnection {

	private Connection connection = null;
	private PreparedStatement preparedStatement = null; 
	private Statement statement = null;
	private Scanner sc = new Scanner(System.in);
	
	public void connectToDb() {
		try {
			//1. Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
	
			//2. Create Connection
			String dbURL = "jdbc:mysql://localhost:3306/jdbcdb";
			String username = "root";
			String password = "root";
			connection = DriverManager.getConnection(dbURL, username, password);
			System.out.println("Connection Succesfull");				
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void printmenu() {
	    boolean isRunning = true;

	    while (isRunning) {
	        System.out.println("Enter choice");
	        System.out.println("1. Insert record");
	        System.out.println("2. Select record");
	        System.out.println("3. Callable Statement : Select record");
	        System.out.println("4. Callable statement : Select record by roll number");
	        System.out.println("5. Update record");
	        System.out.println("6. Delete record");
	        System.out.println("7. Understanding Transaction Management");
	        System.out.println("8. Batch Processing");
	        System.out.println("9. Exit");

	        int choice = Integer.parseInt(sc.nextLine());

	        switch (choice) {
	            case 1:
	                insertRecord();
	                break;
	            case 2:
	                selectRecord();
	                break;
	            case 3:
	                selectAllRecord();
	                break;
	            case 4:
	                selectRecordByRollNumber();
	                break;
	            case 5:
	                updateRecord();
	                break;
	            case 6:
	                deleteRecord();
	                break;
	            case 7:
	                transaction();
	                break;
	            case 8:
	                batchProcessing();
	                break;
	            case 9:
	                isRunning = false; // Exit the loop
	                System.out.println("DB Operation is terminated");
	                break;
	            default:
	                System.out.println("Invalid choice");
	                break;
	        }
	    }
	    
	    sc.close(); // Close Scanner here, after loop exits
	}

	
	public void insertRecord() {
	    String sqlQuery = "INSERT INTO student(name, percentage, address) VALUES (?, ?, ?)";

	    try (PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery)) {
	        System.out.println("Enter the name ");
	        String name = sc.nextLine();

	        System.out.println("Enter percentage ");
	        double percentage = sc.nextDouble();
	        sc.nextLine(); // Consume the newline left by nextDouble()

	        System.out.println("Enter the address ");
	        String address = sc.nextLine();

	        preparedStatement.setString(1, name);
	        preparedStatement.setDouble(2, percentage);
	        preparedStatement.setString(3, address);
	        int rows = preparedStatement.executeUpdate();
	        if (rows > 0) {
	            System.out.println("Record is inserted successfully");
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

	private void selectRecord() {
		System.out.println("Enter the roll number to find record");
		int number = Integer.parseInt(sc.nextLine());

		try {
			String sql = "select * from student where roll_number = "+number;
			statement = connection.createStatement();
			ResultSet result = statement.executeQuery(sql);
			
			if(result.next()) {
				System.out.println(result.getInt("roll_number") + "\t" 
									+ result.getString("name") + "\t"
									+ result.getDouble("percentage") + "\t"
									+ result.getString("address"));
				return;
			}
			System.out.println("No record found...");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	private void selectAllRecord() {

		try {
			CallableStatement callableStatement = connection.prepareCall("{ call GET_ALL() }");
			ResultSet result = callableStatement.executeQuery();
			
			while(result.next()) {
				System.out.println(result.getInt("roll_number") + "\t" 
						+ result.getString("name") + "\t"
						+ result.getDouble("percentage") + "\t"
						+ result.getString("address"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void selectRecordByRollNumber() {

		try {
			System.out.println("Enter the roll_number whose record u want? ");
			int roll_number = Integer.parseInt(sc.nextLine());
			CallableStatement callableStatement = connection.prepareCall("{ call GET_RECORD(?) }");
			
		
			callableStatement.setInt(1, roll_number);
			ResultSet result = callableStatement.executeQuery();
			
			while(result.next()) {
				System.out.println(result.getInt("roll_number") + "\t" 
						+ result.getString("name") + "\t"
						+ result.getDouble("percentage") + "\t"
						+ result.getString("address"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void updateRecord() {
		
		System.out.println("Enter the roll number to update record ");
		int roll = Integer.parseInt(sc.nextLine());
		String sql ="select * from student where roll_number = "+roll;
		
		
		try {
			
			statement= connection.createStatement();
			
			
			ResultSet result = statement.executeQuery(sql);
			
			if(result.next()) {
				System.out.println(result.getInt("roll_number") + "\t" 
						+ result.getString("name") + "\t"
						+ result.getDouble("percentage") + "\t"
						+ result.getString("address"));				
			
				System.out.println("What do you want to update ? ");
				System.out.println("1.Name");
				System.out.println("2.Percentage");
				System.out.println("3.Address");
				int choice = Integer.parseInt(sc.nextLine());
				// update student set name = "nachiket" where roll number is 6
				String sqlQuery = "update student set ";
				
				switch(choice) {
				case 1 :
					System.out.println("Enter new name ");
					String newName = sc.nextLine();
					sqlQuery = sqlQuery + "name = ? where roll_number = "+ roll;
					preparedStatement = connection.prepareStatement(sqlQuery);
					preparedStatement.setString(1, newName);

					int rows = preparedStatement.executeUpdate();
					if(rows > 0) {
						System.out.println("record updated succesfully");
					}
					
					break;
				case 2:
					System.out.println("Enter new percentage ");
					String newPercentage = sc.nextLine();
					sqlQuery = sqlQuery + "percentage = ? where roll_number = "+ roll;
					preparedStatement = connection.prepareStatement(sqlQuery);
					preparedStatement.setString(1, newPercentage);

					int rows1 = preparedStatement.executeUpdate();
					if(rows1 > 0) {
						System.out.println("record updated succesfully");
					}
					
					break;
				case 3:
					System.out.println("Enter new address ");
					String newAddress = sc.nextLine();
					sqlQuery = sqlQuery + "address = ? where roll_number = "+ roll;
					preparedStatement = connection.prepareStatement(sqlQuery);
					preparedStatement.setString(1, newAddress);

					int rows2 = preparedStatement.executeUpdate();
					if(rows2 > 0) {
						System.out.println("record updated succesfully");
					}
					break;
				default:
					break;
				
				}
				
				return;
			}
			
			System.out.println("record not found");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void deleteRecord() {
	    System.out.println("Enter the roll number to delete record ");
	    int roll = Integer.parseInt(sc.nextLine());
	    String sql = "DELETE FROM student WHERE roll_number = ?";

	    try {
	    	preparedStatement = connection.prepareStatement(sql);
	        preparedStatement.setInt(1, roll);
	        int rowsAffected = preparedStatement.executeUpdate();
	        if (rowsAffected > 0) {
	            System.out.println("Record deleted successfully");
	        } else {
	            System.out.println("No record found to delete");
	        }
	    } catch (SQLException e) {
	        System.err.println("SQL Error: " + e.getMessage());
	        e.printStackTrace();
	    }
	}

	
	private void transaction() {	
		
		try {
			
			connection.setAutoCommit(false);
			
			String sql1 = "insert into student(name, percentage, address) values ('Namrata', 79, 'mumbai')";
			String sql2 = "insert into student(name, percentage, address) values ('sakshi', 89, 'pune')";

			preparedStatement = connection.prepareStatement(sql1);
			int row1 = preparedStatement.executeUpdate();
			
			preparedStatement = connection.prepareStatement(sql2);
			int row2 = preparedStatement.executeUpdate();
			
			
			if(row1>0 && row2>0) {
				connection.commit();
			}
			else {
				connection.rollback();
			}
			//if both queries are correct then only it will add commit or add in sql database.
			
			System.out.println("Inserted Successfully");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	private void batchProcessing() {
		

		
		try {
			connection.setAutoCommit(false);
			
			String sql1 = "insert into student(name, percentage, address) values ('abc', 79, 'mumbai')";
			String sql2 = "insert into student(name, percentage, address) values ('xyz', 89, 'pune')";
			String sql3 = "insert into student(name, percentage, address) values ('xyz', 89, 'pune')";

			Statement statement = connection.createStatement();
			
			statement.addBatch(sql1);
			statement.addBatch(sql2);
			statement.addBatch(sql3);
			
			int[] rows =statement.executeBatch();
			
			for(int row : rows) {
				if(row > 0)
					continue;
				connection.rollback();
			}
			connection.commit();
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
