package Practicecodes;

public class LettersinString {

	public static void main(String[] args) {
String b ="bhushan sampat shriram is good student bhushan shriram";
String []a=b.split(" ");
//String a[]= {"bhushan","sampat","shriram","is","good","student","bhushan","shriram"};
for(int i=0;i<a.length;i++) {
	
	for(int j=i+1;j<a.length;j++) {
		if(a[i].equals(a[j])) {
			System.out.println(a[i]);
		}
	}
} 

	}

}
