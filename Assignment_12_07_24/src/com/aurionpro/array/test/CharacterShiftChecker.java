package com.aurionpro.array.test;

import java.util.Scanner;

public class CharacterShiftChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String input = sc.nextLine();

        System.out.println("Enter the number of Shift you want: ");
        int n = sc.nextInt();

        String shiftedString = shiftCharacters(input, n);
        System.out.println("Shifted String: " + shiftedString);
    }

    public static String shiftCharacters(String input, int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char originalChar = input.charAt(i);
            System.out.println(originalChar);
            char shiftedChar = shiftCharacter(originalChar, n);
            sb.append(shiftedChar);
        }

        return sb.toString();
    }

    public static char shiftCharacter(char ch, int n) {
        if ('a' <= ch && ch <= 'z') {
            return shiftInRange(ch, 'a', 'z', n);
        } else if ('A' <= ch && ch <= 'Z') {
            return shiftInRange(ch, 'A', 'Z', n);
        } else {
            return ch; 
        }
    }

    public static char shiftInRange(char ch, char start, char end, int n) {
        int range = end - start + 1;
        int shiftedIndex = ((ch - start + n) % range + range) % range;
        return (char) (start + shiftedIndex);
    }

}
