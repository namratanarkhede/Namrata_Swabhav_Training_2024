package com.aurionpro.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SCMDb {
	private Connection connection = null;
//	private Scanner scanner = new Scanner(System.in);
	private PreparedStatement preparedStatement;

	public void connectToDB() {
		try {
			// 1. register driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. create connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/scm", "root", "root");
			System.out.println("Connection successful");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Supplier methods
	public void getSuppliers() {
		try {
			preparedStatement = connection.prepareStatement("select * from suppliers");
			ResultSet supplierData = preparedStatement.executeQuery();
			while (supplierData.next()) {
				System.out.println(supplierData.getInt("SupplierID") + "\t" + supplierData.getString("Name") + "\t"
						+ supplierData.getString("ContactInfo") + "\t" + supplierData.getString("Address"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addSupplier(int id, String name, String contact, String address) {
		try {
			preparedStatement = connection.prepareStatement("INSERT INTO suppliers VALUES (?, ?, ?, ?)");
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, contact);
			preparedStatement.setString(4, address);
			int rowsAffected = preparedStatement.executeUpdate();
			System.out.println("Supplier added. Rows affected: " + rowsAffected);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateSupplier(int id, String name, String contact, String address) {
		try {
			preparedStatement = connection.prepareStatement(
					"UPDATE suppliers SET name = ?, contactInfo = ?, address = ? WHERE suppliersId = ?");
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, contact);
			preparedStatement.setString(3, address);
			preparedStatement.setInt(4, id);
			int rowsAffected = preparedStatement.executeUpdate();
			System.out.println("Supplier updated. Rows affected: " + rowsAffected);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteSupplier(int id) {
		try {
			preparedStatement = connection.prepareStatement("DELETE FROM suppliers WHERE suppliersId = ?");
			preparedStatement.setInt(1, id);
			int rowsAffected = preparedStatement.executeUpdate();
			System.out.println("Supplier deleted. Rows affected: " + rowsAffected);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Products
	public void getProducts() {
		try {
			preparedStatement = connection.prepareStatement("select * from products");
			ResultSet productData = preparedStatement.executeQuery();
			while (productData.next()) {
				System.out.println(productData.getInt("ProductID") + "\t" 
								+ productData.getString("Name") + "\t"
								+ productData.getString("Description") + "\t" 
								+ productData.getInt("SupplierID"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addProduct(int id, String name, String description, int suppliersId) {
		try {
			preparedStatement = connection.prepareStatement("INSERT INTO products  VALUES (?, ?, ?, ?)");
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, description);
			preparedStatement.setInt(4, suppliersId);
			int rowsAffected = preparedStatement.executeUpdate();
			System.out.println("Product added. Rows affected: " + rowsAffected);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateProduct(int id, String name, String description, int suppliersId) {
		try {
			preparedStatement = connection.prepareStatement(
					"UPDATE products SET name = ?, description = ?, suppliersId = ? WHERE productId = ?");
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, description);
			preparedStatement.setInt(3, suppliersId);
			preparedStatement.setInt(4, id);
			int rowsAffected = preparedStatement.executeUpdate();
			System.out.println("Product updated. Rows affected: " + rowsAffected);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteProduct(int id) {
		try {
			preparedStatement = connection.prepareStatement("DELETE FROM products WHERE productId = ?");
			preparedStatement.setInt(1, id);
			int rowsAffected = preparedStatement.executeUpdate();
			System.out.println("Product deleted. Rows affected: " + rowsAffected);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// ORDERs
	public void getOrders() {
		try {
			preparedStatement = connection.prepareStatement("select * from orders");
			ResultSet orderData = preparedStatement.executeQuery();
			while (orderData.next()) {
				System.out
						.println(orderData.getInt("OrderID") + "\t" 
								+ orderData.getDate("OrderDate") + "\t" 
								+ orderData.getInt("SupplierID"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void addOrder(int id, Date date, int suppliersId) {
		try {
			preparedStatement = connection.prepareStatement("INSERT INTO orders  VALUES (?, ?, ?)");
			preparedStatement.setInt(1, id);
			preparedStatement.setDate(2, date);
			preparedStatement.setInt(3, suppliersId);
			int rowsAffected = preparedStatement.executeUpdate();
			System.out.println("Order added. Rows affected: " + rowsAffected);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateOrder(int id, Date date, int suppliersId) {
		try {
			preparedStatement = connection
					.prepareStatement("UPDATE orders SET date = ?, suppliersId = ? WHERE ordersId = ?");
			preparedStatement.setDate(1, date);
			preparedStatement.setInt(2, suppliersId);
			preparedStatement.setInt(3, id);
			int rowsAffected = preparedStatement.executeUpdate();
			System.out.println("Order updated. Rows affected: " + rowsAffected);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteOrder(int id) {
		try {
			preparedStatement = connection.prepareStatement("DELETE FROM orders WHERE ordersId = ?");
			preparedStatement.setInt(1, id);
			int rowsAffected = preparedStatement.executeUpdate();
			System.out.println("Order deleted. Rows affected: " + rowsAffected);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// OrderDetails
	public void getOrderDetails() {
		try {
			preparedStatement = connection.prepareStatement("select * from orderdetails");
			ResultSet orderDetailsData = preparedStatement.executeQuery();
			while (orderDetailsData.next()) {
				System.out.println(orderDetailsData.getInt("OrderDetailsID") + "\t" 
								+ orderDetailsData.getInt("OrderID") + "\t"
								+ orderDetailsData.getInt("ProductID") + "\t" 
								+ orderDetailsData.getInt("Quantity") + "\t"
								+ orderDetailsData.getDouble("Price"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addOrderDetail(int orderDetailId, int orderId, int productId, int quantity, double price) {
		try {
			preparedStatement = connection.prepareStatement("INSERT INTO orderdetails VALUES (?, ?, ?, ?, ?)");
			preparedStatement.setInt(1, orderDetailId);
			preparedStatement.setInt(2, orderId);
			preparedStatement.setInt(3, productId);
			preparedStatement.setInt(4, quantity);
			preparedStatement.setDouble(5, price);
			int rowsAffected = preparedStatement.executeUpdate();
			System.out.println("Order detail added. Rows affected: " + rowsAffected);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateOrderDetail(int orderDetailId, int quantity, double price) {
		try {
			preparedStatement = connection
					.prepareStatement("UPDATE orderdetails SET quantity = ? , price = ? WHERE orderDetailId = ? ");
			preparedStatement.setInt(1, quantity);
			preparedStatement.setDouble(2, price);
			preparedStatement.setInt(3, orderDetailId);
			int rowsAffected = preparedStatement.executeUpdate();
			System.out.println("Order detail updated. Rows affected: " + rowsAffected);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteOrderDetail(int orderDetailId) {
		try {
			preparedStatement = connection.prepareStatement("DELETE FROM orderdetails WHERE orderDetailId = ?");
			preparedStatement.setInt(1, orderDetailId);
			int rowsAffected = preparedStatement.executeUpdate();
			System.out.println("Order detail deleted. Rows affected: " + rowsAffected);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// inventory
	public void getInventory() {
		try {
			preparedStatement = connection.prepareStatement("select * from inventory");
			ResultSet inventoryData = preparedStatement.executeQuery();
			while (inventoryData.next()) {
				System.out.println(inventoryData.getInt("InventoryID") + "\t" 
								+ inventoryData.getInt("ProductID") + "\t"
								+ inventoryData.getInt("QuantityOnHand"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void addInventory(int inventoryId, int productId, int quantityOnHand) {
        try {
            preparedStatement = connection.prepareStatement("INSERT INTO inventory  VALUES (?, ?, ?)");
            preparedStatement.setInt(1, inventoryId);
            preparedStatement.setInt(2, productId);
            preparedStatement.setInt(3, quantityOnHand);
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Inventory added. Rows affected: " + rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateInventory(int inventoryId, int productId, int quantityOnHand) {
        try {
            preparedStatement = connection.prepareStatement("UPDATE inventory SET quantityOnHand = ? WHERE inventoryId = ?");
            preparedStatement.setInt(1, quantityOnHand);
            preparedStatement.setInt(2, inventoryId);
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Inventory updated. Rows affected: " + rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteInventory(int inventoryId) {
        try {
            preparedStatement = connection.prepareStatement("DELETE FROM inventory WHERE inventoryId = ?");
            preparedStatement.setInt(1, inventoryId);
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Inventory deleted. Rows affected: " + rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
 // Custom Query Methods
    public void listProductsWithSupplierNames() {
        try {
            preparedStatement = connection.prepareStatement(
                "SELECT p.*, s.name AS supplierName " +
                "FROM emarket.products p " +
                "JOIN emarket.suppliers s ON p.suppliersId = s.suppliersId"
            );
            ResultSet result = preparedStatement.executeQuery();
            while (result.next()) {
                System.out.println(result.getInt("productId") + "\t" + result.getString("name") + "\t" +
                                   result.getString("supplierName"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void getOrdersWithDetails() {
        try {
            preparedStatement = connection.prepareStatement(
                "SELECT o.ordersId, o.orderDate, od.orderDetailId, p.name AS ProductName, " +
                "od.quantity AS Quantities, od.price " +
                "FROM emarket.orders o " +
                "JOIN emarket.orderdetails od ON o.ordersId = od.orderId " +
                "LEFT JOIN emarket.products p ON od.productId = p.productId"
            );
            ResultSet result = preparedStatement.executeQuery();
            while (result.next()) {
                System.out.println(result.getInt("ordersId") + "\t" + result.getDate("orderDate") + "\t" +
                                   result.getInt("orderDetailId") + "\t" + result.getString("ProductName") + "\t" +
                                   result.getInt("Quantities") + "\t" + result.getDouble("price"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void findSuppliersByProductId(int productId) {
        try {
            preparedStatement = connection.prepareStatement(
                "SELECT s.* " +
                "FROM emarket.suppliers s " +
                "LEFT JOIN emarket.products p ON s.suppliersId = p.suppliersId " +
                "WHERE p.productId = ?"
            );
            preparedStatement.setInt(1, productId);
            ResultSet result = preparedStatement.executeQuery();
            while (result.next()) {
                System.out.println(result.getInt("suppliersId") + "\t" + result.getString("name") + "\t" +
                                   result.getString("contactInfo") + "\t" + result.getString("address"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void listProductsAndInventoryLevels() {
        try {
            preparedStatement = connection.prepareStatement(
                "SELECT p.*, i.quantityonHand AS CurrentInventoryLevels " +
                "FROM emarket.products p " +
                "LEFT JOIN emarket.inventory i ON p.productId = i.productId"
            );
            ResultSet result = preparedStatement.executeQuery();
            while (result.next()) {
                System.out.println(result.getInt("productId") + "\t" + result.getString("name") + "\t" +
                                   result.getInt("CurrentInventoryLevels"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void findOrdersLastMonth() {
        try {
            preparedStatement = connection.prepareStatement(
                "SELECT * " +
                "FROM emarket.orders " +
                "WHERE orderDate >= CURRENT_DATE() - INTERVAL 1 MONTH"
            );
            ResultSet result = preparedStatement.executeQuery();
            while (result.next()) {
                System.out.println(result.getInt("ordersId") + "\t" + result.getDate("orderDate") + "\t" +
                                   result.getInt("suppliersId"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void totalQuantityOrderedForEachProduct() {
        try {
            preparedStatement = connection.prepareStatement(
                "SELECT p.productId, p.name AS ProductName, SUM(od.quantity) AS TotalQuantityOrdered " +
                "FROM emarket.orderdetails od " +
                "LEFT JOIN emarket.products p ON od.productId = p.productId " +
                "GROUP BY p.productId"
            );
            ResultSet result = preparedStatement.executeQuery();
            while (result.next()) {
                System.out.println(result.getInt("productId") + "\t" + result.getString("ProductName") + "\t" +
                                   result.getInt("TotalQuantityOrdered"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void retrieveOrdersWithTotalAmount() {
        try {
            preparedStatement = connection.prepareStatement(
                "SELECT o.*, SUM(od.price * od.quantity) AS totalAmountSpent " +
                "FROM emarket.orders o " +
                "JOIN emarket.orderdetails od ON o.ordersId = od.orderId " +
                "GROUP BY o.ordersId"
            );
            ResultSet result = preparedStatement.executeQuery();
            while (result.next()) {
                System.out.println(result.getInt("ordersId") + "\t" + result.getDate("orderDate") + "\t" +
                                   result.getDouble("totalAmountSpent"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void findProductsSuppliedByMoreThanOneSupplier() {
        try {
            preparedStatement = connection.prepareStatement(
                "SELECT p.*, COUNT(p.suppliersId) AS supplierCount " +
                "FROM emarket.products p " +
                "JOIN emarket.suppliers s ON p.suppliersId = s.suppliersId " +
                "GROUP BY p.productId " +
                "HAVING COUNT(p.suppliersId) > 1"
            );
            ResultSet result = preparedStatement.executeQuery();
            while (result.next()) {
                System.out.println(result.getInt("productId") + "\t" + result.getString("name") + "\t" +
                                   result.getInt("supplierCount"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void averageInventoryLevelForEachProduct() {
        try {
            preparedStatement = connection.prepareStatement(
                "SELECT p.*, AVG(i.quantityonHand) AS AverageInventoryLevel " +
                "FROM emarket.products p " +
                "JOIN emarket.inventory i ON p.productId = i.productId " +
                "GROUP BY p.productId, p.name"
            );
            ResultSet result = preparedStatement.executeQuery();
            while (result.next()) {
                System.out.println(result.getInt("productId") + "\t" + result.getString("name") + "\t" +
                                   result.getDouble("AverageInventoryLevel"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void listSuppliersWithNoProducts() {
        try {
            preparedStatement = connection.prepareStatement(
                "SELECT s.* " +
                "FROM emarket.suppliers s " +
                "LEFT JOIN emarket.products p ON s.suppliersId = p.suppliersId " +
                "WHERE p.productId IS NULL"
            );
            ResultSet result = preparedStatement.executeQuery();
            while (result.next()) {
                System.out.println(result.getInt("suppliersId") + "\t" + result.getString("name") + "\t" +
                                   result.getString("contactInfo") + "\t" + result.getString("address"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
