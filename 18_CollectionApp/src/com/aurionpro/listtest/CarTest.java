package com.aurionpro.listtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;
import javax.swing.plaf.synth.SynthSpinnerUI;

import com.aurionpro.list.model.Car;

public class CarTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Car> cars = new ArrayList<Car>();
		
		System.out.println("Enter the number of cars u want to add: ");
		int n = sc.nextInt();
		
		
		System.out.println("Enter the car details:");
		readCar(cars, n, sc);
		carDetails(cars);
		MaximumMileage(cars);
	}


	private static void MaximumMileage(List<Car> cars) {
		 Car maxMileageCar = cars.get(0);

	     for (Car car : cars) {
	         if (car.getMileage() > maxMileageCar.getMileage()) {
	              maxMileageCar = car;
	         }
	     }

	     System.out.println("Car with maximum mileage: " + maxMileageCar);
	 }


	private static void readCar(List<Car> cars, int n, Scanner sc) {
		for(int i =0 ; i< n ; i++) {
			System.out.println("Enter the carId");
			int carId = sc.nextInt();
			System.out.println("Enter the companyName :");
			String companyName = sc.next();
			System.out.println("Enter the price of the car: ");
			double price = sc.nextDouble();
			System.out.println("Enter the mileage of car: ");
			double mileage = sc.nextDouble();
			cars.add(new Car(carId, companyName, price, mileage));
		}
		
	}

	private static void carDetails(List<Car> cars) {
		for(Car car: cars) {
			System.out.println(car);
		}
	}
	

}
