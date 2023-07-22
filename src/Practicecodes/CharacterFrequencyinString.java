package Practicecodes;

public class CharacterFrequencyinString {

	public static void main(String[] args) {
		String s="bhushan shriram";
		for(char ch='a';ch<'z';ch++) {
			int c=0;
			for(int i=0;i<s.length();i++) {
				if(ch==s.charAt(i)) {
					c++;
				}
				
			}
			if(c!=0) {
				
				System.out.println(ch+"\t"+c);
			}
		}
	}

}
