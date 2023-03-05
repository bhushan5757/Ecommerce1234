package Practicecodes;

public class ReverseString {

	public static void main(String[] args) {
		String a = "Bhushan sampat shriram";
		System.out.println("String a before reverse = "+a );
		String rev = "";
		int b = a.length();
		System.out.println("Length of string = "+b);
		
		for (int i = b - 1; i >= 0; i--) {
			char ch = a.charAt(i);
			rev = rev + ch;
		}
		System.out.println("String a after reverse = "+ rev );
	}

}
