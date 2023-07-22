package Practicecodes;

import java.util.Scanner;

public class AlphabetCheck {
	
	
public static void main (String[] args) {
	    // Arguments will be read by STDIN
	    Scanner s = new Scanner(System.in); // do not change this
	    System.out.println("input");
	    String inputLine = s.nextLine(); // do not change this

	    // you code will be inside this main method
	    // to view the output, just print the string

	       boolean[] alphabet = new boolean[26]; // Array to store presence of each alphabet letter

	        // Iterate over each character in the input string
	        for (int i = 0; i < inputLine.length(); i++) {
	            char c = inputLine.charAt(i);
	            if (Character.isLetter(c)) {
	                // Mark the presence of the letter in the alphabet array
	                alphabet[c - 'a'] = true;
	            }
	        }

	        // Check if every letter of the alphabet is present in the string
	        boolean allLettersPresent = true;
	        for (boolean letterPresent : alphabet) {
	            if (!letterPresent) {
	                allLettersPresent = false;
	                break;
	            }
	        }

	        // Output the result
	        System.out.println(allLettersPresent ? "true" : "false");
	    }

}
