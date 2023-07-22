package Practicecodes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PrimeNumber {

	public static void main(String[] args) {
	for(int j=1;j<=20;j++) {
	int count = 0;
	for(int i=1;i<=j;i++) {
		if(j%i==0) {
			count++;
		}
	}
	if(count==2) {
		System.out.println(j);
	}
	
	}
	}
}
