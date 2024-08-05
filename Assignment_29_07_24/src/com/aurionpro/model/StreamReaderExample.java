package com.aurionpro.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamReaderExample {

	private String filePath;

	public StreamReaderExample(String filePath) {
		super();
		this.filePath = filePath;
	}
	
	public void readLines() {
		
		try {
			Stream<String> fileLines = Files.lines(Paths.get(filePath));
			fileLines.forEach(fileLine->System.out.println(fileLine));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
