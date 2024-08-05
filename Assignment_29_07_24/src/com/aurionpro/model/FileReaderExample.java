package com.aurionpro.model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
	
	private String filePath;
	

	public FileReaderExample(String filePath) {
		super();
		this.filePath = filePath;
	}
	public void readLines() {
		try {
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
			String fileLine;
			while((fileLine = reader.readLine()) != null) {
				System.out.println(fileLine);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
