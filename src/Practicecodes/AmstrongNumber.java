package Practicecodes;

public class AmstrongNumber {

	public static void main(String[] args) {
int num=371;
int temp=num;
int b,sum=0;
while(num>0) {
	
	 b=num%10;
	 num=num/10;
	sum=sum+b*b*b;
}

if(temp==sum) {
	System.out.println("num  is Amstrong number");
}else {
	System.out.println("num is not Amstrong number");
}



	}

}
