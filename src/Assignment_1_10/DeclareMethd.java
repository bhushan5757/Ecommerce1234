package Assignment_1_10;

import java.util.*;
import java.util.stream.Collectors;

public  class DeclareMethd {
	


		


	

		  public static void main (String[] args) {
		    // Arguments will be read by STDIN
		    Scanner s = new Scanner(System.in); // do not change this
		    System.out.println("input");
		    String inputLine = s.nextLine(); // do not change this

		    // you code will be inside this main method
		    // to view the output, just print the string

		        for(char i :inputLine.toCharArray()){
		        if ( inputLine.indexOf(i) == inputLine.lastIndexOf(i)) {
		            System.out.println(i);
		            break;
		        }
		        }
		  }
		}



