package Practicecodes;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int number=sc.nextInt();
      int count=0;
      
      if(number>1) {
    	  for(int i=1;i<=number;i++) {
    		  if(number%i==0) {
    			  count++;
    		  }
    		  
    	  }
    	  if(count==2) {
			  System.out.println("number is prime number");
		  }else {
			  System.out.println("number not a prime number");
		  }
    	  
      }else {
    	  System.out.println("not a prime number");
      }
	}

}
