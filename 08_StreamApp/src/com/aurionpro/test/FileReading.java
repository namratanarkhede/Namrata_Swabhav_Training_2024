package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReading {
	public static void main(String[] args) {
		try {
			int ch;
			FileInputStream fileInputStream = new FileInputStream("D:\\Aurionpro_training\\11_StreamApp\\src\\com\\aurionpro\\test\\test1");
			int characterCount = 0;
            int wordCount = 0;
            int lineCount = 0;
            
            boolean isWord = false;
            

            while ((ch = fileInputStream.read()) != -1) {
                characterCount++;
                if (ch == '\n') {
                    lineCount++;
                }

                if (Character.isWhitespace(ch)) {
                    if (isWord) {
                        wordCount++;
                        isWord = false;
                    }
                } else {
                    isWord = true;
                }
            }
            if (isWord) {
                wordCount++;
            }
            if (characterCount > 0) {
                lineCount++;
            }

            fileInputStream.close();

            System.out.println("Characters in file: " + characterCount);
            System.out.println("Words in file: " + wordCount);
            System.out.println("Lines in file: " + lineCount);
		
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
