package Assignment_1_10;



import java.util.*;

public class Stud4 {
	/* Assignment No. 4: 
	* Program-1
	 Write the java program to design method for 
	addition of two number which 
	 returns int results to that method 
	 and result should be print into main method*/
  
    public int demo(int a,int b) {
    	int c =a+b;
    	return c;
    }
    /*Program-2
    Write the java program to design method for 
   substraction of two number which 
    returns int results to that method 
    and result should be print into main method*/
    public int demo1(int p,int q) {
    	int r =p-q;
    	return r;
    }
    /* Program-3
    Write the java program to design method for 
   Multiplication of two number which 
    returns int results to that method 
    and result should be print into main method*/
    public int demo2(int p,int q) {
    	int r =p*q;
    	return r;
    }
    /* Assignment No. 4: 
    * Program-4
     Write the java program to design method for 
    Division of two number which 
     returns int results to that method 
     and result should be print into main method*/
    public int demo3(int p,int q) {
    	int r =p/q;
    	return r;
    }
    /* Assignment No. 4: 
    * Program-5
     Write the Java Program to calculate total of 
    five subject marks and average of it. */
    public int demo2(int p,int c,int q,int e,int o) {
    	int r,avg;
    	 r =p+q+c+e+o;
    	return avg=r/5;
    }
    public static void main(String[] args) {
		Stud4 stud=new Stud4();
		System.out.println(stud.demo(5, 4));
		System.out.println(stud.demo1(5, 4));
		System.out.println(stud.demo2(5, 4));
		System.out.println(stud.demo3(5, 4));
		System.out.println(stud.demo2(5, 4,3,2,1));
	}
}
