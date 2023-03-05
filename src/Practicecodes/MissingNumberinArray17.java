package Practicecodes;

public class MissingNumberinArray17 {

	public static void main(String[] args) {
int []arr= {1,2,3,4,5,6,7,8,10};
int sum=0,elementSum=0,MissingElement=0;

for(int i=0;i<arr.length;i++) {
	sum=sum+arr[i];
}
for(int i=1;i<=10;i++) {
	elementSum=elementSum+i;
}
MissingElement=elementSum-sum;
System.out.println("Missing Element is = "+ MissingElement);
	}

}
