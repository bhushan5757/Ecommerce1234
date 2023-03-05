package Practicecodes;

import java.util.Arrays;

public class SplitIntoNsubarray {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int startIndex = 0;
		int subArraySize =7;

		while (startIndex < array.length) {
		    int endIndex = Math.min(startIndex + subArraySize, array.length);
		    int[] subArray = Arrays.copyOfRange(array, startIndex, endIndex);
		    System.out.println(Arrays.toString(subArray));
		    startIndex += subArraySize;
		}
	}

}
