package Practicecodes;

public class FabbonacciSeries {

	public static void main(String[] args) {
int n1=1;
int n2=2;
int sum=0;

System.out.print(n1+","+n2+",");
for(int i=3;i<=10;i++) {
	sum=n1+n2;
	n1=n2;
	n2=sum;
	System.out.print(sum+",");
	
	
}

//0 1 1 2 3 5 8 13 21 .....
		int value1 = 2;
		int value2 = 3;
		int sun = 0;
		System.out.println();
		System.out.print(value1+" "+value2);
		
			while(sum>30) {
				
		for (int i = 4; i <=10; i++) {

			sun = value1 + value2;
			value1 = value2;
			value2 = sun;
			
			
			System.out.print(" " + sun);}
			break;
			}
			
	}

	}


