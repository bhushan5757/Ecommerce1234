package Practicecodes;

import java.util.Scanner;

public class NoPositiveorNegative {

	public static void main(String[] args) {
Scanner sc=new Scanner (System.in);
System.out.println("user inpute  = ");
int a= sc.nextInt();
if(a>0) {
	System.out.println("number is positive ");
}else if(a<0){
	System.out.println("number is negative ");
	}else {
		System.out.println("invalid input");
	}

	}

}
