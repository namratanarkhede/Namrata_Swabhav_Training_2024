package com.aurionpro.test;

import java.io.File;
import java.io.IOException;

public class FileClass {
	public static void main(String[] args) {

		String fileName = "D:\\Aurionpro_training\\11_StreamApp\\src\\com\\aurionpro\\test\\test4";

		File file = new File(fileName);

        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }

        // using the methods of file we get all the info.
        if (file.exists()) {
            System.out.println("File name: " + file.getName());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Writeable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());
            System.out.println("File size in bytes: " + file.length());
        }

        // we can also create Directories
        String directoryName =  "D:\\Aurionpro_training\\11_StreamApp\\src\\com\\aurionpro\\test\\test";
        File directory = new File(directoryName);

        if (directory.mkdir()) {
            System.out.println("Directory created: " + directory.getName());
        } else {
            System.out.println("Directory already exists.");
        }

        // we can see the files contain in Directory 
        String dirPath =  "D:\\Aurionpro_training\\11_StreamApp\\src\\com\\aurionpro\\test\\test";
        File dir = new File(dirPath);
        String[] filesList = dir.list();
        
        if (filesList != null) {
            System.out.println("Files and directories in the specified path:");
            for (String fileNameInDir : filesList) {
                System.out.println(fileNameInDir);
            }
        } else {
            System.out.println("The specified path does not denote a directory.");
        }

        
    }

}
