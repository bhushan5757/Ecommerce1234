package Practicecodes;

public class SwapNumbers {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		int temp=a+b;
		System.out.println("Before swapping number a & b are "+ a+" & "+b);
		
		b=temp-b;
		a=temp-a;
		System.out.println("After swapping number a & b are "+ a+" & "+b);

		
		

	}

}
