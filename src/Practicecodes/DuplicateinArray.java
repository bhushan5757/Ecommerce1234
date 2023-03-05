package Practicecodes;

public class DuplicateinArray {

	public static void main(String[] args) {
		String arr[] = { "java", "c", "bhushan", "ram","ram" ,"java"};
		boolean flag=false;
		System.out.print("Duplicates are ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {

					System.out.print(arr[i]+',');
					flag=true;
				}
				}
			}
		if(flag==false) {
			System.out.println("not found");
		}

	}

}
