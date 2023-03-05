package Practicecodes;

public class PalindromNumber {
	// after reversing both the numbrs are equal

	public static void main(String[] args) {
     int num=393;
     int number=num;
     int rev=0;
     while(num!=0) {
    	 rev=rev*10+num%10;
    	 num=num/10;
     }
     if(number==rev) {
    	 System.out.println(number+" is Palindrome Number");
     }else {
    	 System.out.println(number+"is not Palindrome Number");
     }
	}

}
