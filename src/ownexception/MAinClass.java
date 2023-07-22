package ownexception;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MAinClass {

	public static void main(String[] args) {
	int a=153;
	int c=a;
	int rev=0;
	while(a>0) {
		int b=a%10;
		rev=rev+b*b*b;
		a=a/10;
	}
	if(c==rev) {
               System.out.println("amStrong number");
               }
	else {
		System.out.println("not amstrong nue");
		}
		
		
/*		String str = "grass is greener on the other side";
for(char i='a';i<='z';i++) {
	int count=0;
	for(int j=0;j<str.length();j++) {
		if(str.charAt(j)==i) {
			count++;
		}
	}
	if(count!=0) {
		System.out.println(i+":"+count);
	}
	
}*/

		/*
		 * Map <Character,Integer> map=new HashMap<Character,Integer>(); for(int
		 * i=0;i<str.length();i++) { char ch=str.charAt(i); if(ch!=' ') {
		 * //map.put(ch,map.get(ch)+1);
		 * 
		 * map.put(ch,map.getOrDefault(ch,0)+1); }
		 * 
		 * } //System.out.println(map); for(Map.Entry<Character, Integer>
		 * e:map.entrySet()) { System.out.println(e.getKey()+" : "+e.getValue()); }
		 */

	}

}
