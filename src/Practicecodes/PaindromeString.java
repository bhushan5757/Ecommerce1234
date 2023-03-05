package Practicecodes;

public class PaindromeString {

	public static void main(String[] args) {
String a="radar";
String b=a;
String rev="";
for(int i=a.length()-1;i>=0;i--) {
	char ch=a.charAt(i);
	rev=rev+ch;
}
System.out.println(rev);
if(b.equals(rev)) {
	System.out.println(b+" is a Palindrome String");
}else {
	System.out.println(b+" not Palindrome String");
}

	}

}
