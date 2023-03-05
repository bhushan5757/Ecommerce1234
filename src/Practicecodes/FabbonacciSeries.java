package Practicecodes;

public class FabbonacciSeries {

	public static void main(String[] args) {
// 0 1 1 2 3 5 8 13 21 .....
		int value1 = 2;
		int value2 = 3;
		int sum = 0;
		System.out.print(value1+" "+value2);
		for (int i = 4; i <=10; i++) {

			sum = value1 + value2;
			value1 = value2;
			value2 = sum;
			System.out.print(" " + sum);

		}
		

	}

	private static int i(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
