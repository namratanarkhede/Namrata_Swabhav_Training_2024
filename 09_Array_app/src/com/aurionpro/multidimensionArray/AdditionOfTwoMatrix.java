package com.aurionpro.multidimensionArray;

import java.util.Scanner;

public class AdditionOfTwoMatrix {
	
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter the number of rows of the first matrix: ");
	        int rows1 = sc.nextInt();
	        System.out.println("Enter the number of columns of the first matrix: ");
	        int cols1 = sc.nextInt();

	        System.out.println("Enter the elements of the first matrix:");
	        int[][] matrix1 = readMatrix(sc, rows1, cols1);

	        System.out.println("Enter the number of rows of the second matrix: ");
	        int rows2 = sc.nextInt();
	        System.out.println("Enter the number of columns of the second matrix: ");
	        int cols2 = sc.nextInt();

	        System.out.println("Enter the elements of the second matrix:");
	        int[][] matrix2 = readMatrix(sc, rows2, cols2);

	        if (rows1 == rows2 && cols1 == cols2) {
	            int[][] resultMatrix = addMatrices(matrix1, matrix2, rows1, cols1);

	            System.out.println("The resultant matrix after addition is:");
	            printMatrix(resultMatrix, rows1, cols1);
	        } else {
	            System.out.println("Matrices have different dimensions and cannot be added.");
	        }
	    }

	    public static int[][] readMatrix(Scanner sc, int rows, int cols) {
	        int[][] matrix = new int[rows][cols];
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                matrix[i][j] = sc.nextInt();
	            }
	        }
	        return matrix;
	    }

	    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2, int rows, int cols) {
	        int[][] result = new int[rows][cols];
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                result[i][j] = matrix1[i][j] + matrix2[i][j];
	            }
	        }
	        return result;
	    }

	    public static void printMatrix(int[][] matrix, int rows, int cols) {
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

}
