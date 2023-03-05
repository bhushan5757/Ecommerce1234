package Practicecodes;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("number which want to be as a factors = ");
int num=sc.nextInt();
long factorial=1;
for(int i=1;i<=num;i++) {
	factorial= factorial*i;
	
}
System.out.println("factorial of number is = "+ factorial);
		
	}

}
