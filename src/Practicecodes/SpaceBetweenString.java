package Practicecodes;

public class SpaceBetweenString {

	public static void main(String[] args) {
	String b="bhushan sampat shriram is good person";
	int l=b.length();
	int count=0;
	char ch=0;
for(int i=l-1;i>=0;i--) {
	 ch =b.charAt(i);
	 if (ch ==' ') {
			count++;
		}
}
int characters=l-count;
System.out.println("Spaces inbetween Whole String = "+count);
System.out.println(" Count of Characters in String are = "+ characters);
	}

}
