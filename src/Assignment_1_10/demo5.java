package Assignment_1_10;

import java.util.Scanner;

public class demo5 {
	/* Assignment No. 5: 
	* Program-1
	 write a program to check the number is positive 
	or negative.
	*/
public static String m1() {
	Scanner sc=new Scanner(System.in);
	System.out.println("give your input");
	int a=sc.nextInt();
	if(a>0) {
		return "Given number is positive";
	}else if(a<0) {
		return "given number is negative";
	}else {
		return "it is a zero";
	}
	
}

	public static void main(String[] args) {
		System.out.println(m1());
		

	}

}
