package Practicecodes;

public class DuplicateString {

	public static void main(String[] args) {
	String [] str= {"AA","BB","AA","DD","CC",  "DD","AA"};
	
	
	for(int i=0;i<str.length;i++) {
	
		for(int j=i+1;j<str.length;j++) {
			if(str[i]==str[j])
				System.out.println(str[i]);
		}
		
		
	}
}
	


}