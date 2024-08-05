package com.aurionpro.test;

import java.util.Scanner;

public class MatrixTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int matrix[][] = new int[3][3];
		System.out.println("Enter the matrix element :");
		createRows(matrix, sc);
		printMatrix(matrix);
		
	}
	
	private static void createRows(int matrix[][], Scanner sc) {
		for(int rows= 0; rows < 3; rows++) {
			readRowElements(matrix, sc , rows);
		}
	}

	private static void readRowElements(int[][] matrix, Scanner sc, int rows) {
		for(int cols = 0; cols < 3; cols++) {
			matrix[rows][cols] = sc.nextInt();
		}
	}
	private static void printMatrix(int matrix[][]) {
		for(int rows= 0; rows < 3; rows++) {
			printRows(matrix , rows);
		}
	}

	private static void printRows(int[][] matrix, int rows) {
		for(int cols = 0; cols < 3; cols++) {
			System.out.print(matrix[rows][cols]+ " \t");
		}
		System.out.println();
	}

}
