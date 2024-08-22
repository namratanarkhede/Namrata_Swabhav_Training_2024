package com.aurionpro.test;

import java.sql.Date;
import java.util.Scanner;

import com.aurionpro.model.SCMDb;

public class SCMDBTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SCMDb db = new SCMDb();
        db.connectToDB();

        mainMenuDriver(scanner, db);
        
        scanner.close(); 
    }

    public static void mainMenuDriver(Scanner scanner, SCMDb db) {
        boolean flag = true;

        while (flag) {
            System.out.println("\nSelect an option:\n1. Get Records\t2. Add Records"
            		+ "\t3. Update Records\t4. Delete Records\t5. Custom Queries\t6. EXIT");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    getMenuDriver(scanner, db);
                    break;
                case 2:
                    addMenuDriver(scanner, db);
                    break;
                case 3:
                    updateMenuDriver(scanner, db);
                    break;
                case 4:
                    deleteMenuDriver(scanner, db);
                    break;                    
                case 5:
                    customQueryMenuDriver(scanner, db);
                    break;
                case 6:
                    flag = false;
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("Select a valid option");
                    break;
            }
        }
    }

    public static void getMenuDriver(Scanner scanner, SCMDb db) {
        boolean flag = true;

        while (flag) {
            System.out.println("\nSelect the records to view:\n1. View Suppliers\t2. View Products\t3. View Orders"
                    + "\t4. View OrderDetails\t5. View Inventory\t6. BACK");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    db.getSuppliers();
                    break;
                case 2:
                    db.getProducts();
                    break;
                case 3:
                    db.getOrders();
                    break;
                case 4:
                    db.getOrderDetails();
                    break;
                case 5:
                    db.getInventory();
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("Select a valid option");
                    break;
            }
        }
    }

    public static void addMenuDriver(Scanner scanner, SCMDb db) {
        boolean flag = true;

        while (flag) {
            System.out.println("\nSelect the record type to add:\n1. Add Supplier\t2. Add Product\t3. Add Order"
                    + "\t4. Add OrderDetail\t5. Add Inventory\t6. BACK");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Supplier ID, Name, Contact, Address:");
                    db.addSupplier(scanner.nextInt(), scanner.next(), scanner.next(), scanner.next());
                    break;
                case 2:
                    System.out.println("Enter Product ID, Name, Description, Supplier ID:");
                    db.addProduct(scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextInt());
                    break;
                case 3:
                    System.out.println("Enter Order ID, Date (YYYY-MM-DD), Supplier ID:");
                    db.addOrder(scanner.nextInt(), Date.valueOf(scanner.next()), scanner.nextInt());
                    break;
                case 4:
                    System.out.println("Enter OrderDetail ID, Order ID, Product ID, Quantity, Price:");
                    db.addOrderDetail(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextDouble());
                    break;
                case 5:
                    System.out.println("Enter Inventory ID, Product ID, Quantity On Hand:");
                    db.addInventory(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("Select a valid option");
                    break;
            }
        }
    }

    public static void updateMenuDriver(Scanner scanner, SCMDb db) {
        boolean flag = true;

        while (flag) {
            System.out.println("\nSelect the record type to update:\n1. Update Supplier\t2. Update Product\t3. Update Order"
                    + "\t4. Update OrderDetail\t5. Update Inventory\t6. BACK");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Supplier ID, Name, Contact, Address:");
                    db.updateSupplier(scanner.nextInt(), scanner.next(), scanner.next(), scanner.next());
                    break;
                case 2:
                    System.out.println("Enter Product ID, Name, Description, Supplier ID:");
                    db.updateProduct(scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextInt());
                    break;
                case 3:
                    System.out.println("Enter Order ID, Date (YYYY-MM-DD), Supplier ID:");
                    db.updateOrder(scanner.nextInt(), Date.valueOf(scanner.next()), scanner.nextInt());
                    break;
                case 4:
                    System.out.println("Enter OrderDetail ID, Quantity, Price:");
                    db.updateOrderDetail(scanner.nextInt(), scanner.nextInt(), scanner.nextDouble());
                    break;
                case 5:
                    System.out.println("Enter Inventory ID, Quantity On Hand:");
                    db.updateInventory(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("Select a valid option");
                    break;
            }
        }
    }

    public static void deleteMenuDriver(Scanner scanner, SCMDb db) {
        boolean flag = true;

        while (flag) {
            System.out.println("\nSelect the record type to delete:\n1. Delete Supplier\t2. Delete Product\t3. Delete Order"
                    + "\t4. Delete OrderDetail\t5. Delete Inventory\t6. BACK");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Supplier ID:");
                    db.deleteSupplier(scanner.nextInt());
                    break;
                case 2:
                    System.out.println("Enter Product ID:");
                    db.deleteProduct(scanner.nextInt());
                    break;
                case 3:
                    System.out.println("Enter Order ID:");
                    db.deleteOrder(scanner.nextInt());
                    break;
                case 4:
                    System.out.println("Enter OrderDetail ID:");
                    db.deleteOrderDetail(scanner.nextInt());
                    break;
                case 5:
                    System.out.println("Enter Inventory ID:");
                    db.deleteInventory(scanner.nextInt());
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("Select a valid option");
                    break;
            }
        }
    }
    
    public static void customQueryMenuDriver(Scanner scanner, SCMDb db) {
        boolean flag = true;

        while (flag) {
            System.out.println("\nSelect a custom query option:"
            		+ "\n1. List Products with Supplier Names"
            		+ "\n2. Orders with Details"
                    + "\n3. Suppliers for Specific Product"
                    + "\n4. Products and Inventory Levels"
                    + "\n5. Orders Last Month"
                    + "\n6. Total Quantity Ordered for Each Product"
                    + "\n7. Orders with Total Amount Spent"
                    + "\n8. Products Supplied by More Than One Supplier"
                    + "\n9. Average Inventory Level for Each Product"
                    + "\n10. Suppliers with No Products"
                    + "\n11. BACK");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    db.listProductsWithSupplierNames();
                    break;
                case 2:
                    db.getOrdersWithDetails();
                    break;
                case 3:
                    System.out.println("Enter Product ID:");
                    db.findSuppliersByProductId(scanner.nextInt());
                    break;
                case 4:
                    db.listProductsAndInventoryLevels();
                    break;
                case 5:
                    db.findOrdersLastMonth();
                    break;
                case 6:
                    db.totalQuantityOrderedForEachProduct();
                    break;
                case 7:
                    db.retrieveOrdersWithTotalAmount();
                    break;
                case 8:
                    db.findProductsSuppliedByMoreThanOneSupplier();
                    break;
                case 9:
                    db.averageInventoryLevelForEachProduct();
                    break;
                case 10:
                    db.listSuppliersWithNoProducts();
                    break;
                case 11:
                    flag = false;
                    break;
                default:
                    System.out.println("Select a valid option");
                    break;
            }
        }
    }
}
