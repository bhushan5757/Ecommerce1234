package Practicecodes;

public class LettersinString {

	public static void main(String[] args) {
String b ="bhushan sampat shriram is good student";
int original =b.length();
System.out.println("Before Counting the Lettrs = "+original);
 b=b.replaceAll(" ", "");
int count=b.length();
System.out.println("Count Of Characters in String Is = "+ count);

	}

}
