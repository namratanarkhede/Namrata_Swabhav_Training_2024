package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWritting {
	public static void main(String[] args) {
		try {
			int ch;
			FileInputStream fileInputStream = new FileInputStream("D:\\Aurionpro_training\\11_StreamApp\\src\\com\\aurionpro\\test\\test1");
			FileOutputStream fileOutputStream = new FileOutputStream("D:\\Aurionpro_training\\11_StreamApp\\src\\com\\aurionpro\\test\\test2");

           while((ch= fileInputStream.read())!=-1) {
        	   fileOutputStream.write(ch);
           }
           System.out.println("File copied successfully");
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
