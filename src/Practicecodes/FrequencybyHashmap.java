  package Practicecodes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FrequencybyHashmap {

	public static void main(String[] args) {
		String s="bhushan is good student shriram";
		
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();

		for(int i=0;i<s.length();i++) {
			Character ch=s.charAt(i);
			if (ch !=' '){
			map.put(ch, map.getOrDefault(ch, 0)+1);}
			
		}
		String str="Aplle is cool Thing";
		for(int i=0;i<str.length();i++) {
			Character ch=str.charAt(i);
			map.put(ch,map.getOrDefault(ch, 0)+1);
		}
		
for(Map.Entry<Character, Integer> e:map.entrySet()) {
	
	System.out.println(e.getKey()+" : "+e.getValue());
}
		String b []=s.split(" ");
		String rev="";
		for(int i=b.length-1;i>=0;i--) {
		rev=rev+b[i]+" ";
		}
		
		System.out.println(rev);
	}

}
