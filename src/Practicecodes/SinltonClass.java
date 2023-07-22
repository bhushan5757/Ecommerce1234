package Practicecodes;

public class SinltonClass {

	static SinltonClass st=new SinltonClass();
	
	private SinltonClass() {
		
		
	}
	public static SinltonClass getDetails() {
		return st;
		
	}
	
	
	
	
	public static void main(String[] args) {
		SinltonClass  s1=SinltonClass.getDetails();
		SinltonClass  s2=SinltonClass.getDetails();
		SinltonClass  s3=SinltonClass.getDetails();
		SinltonClass  s4=SinltonClass.getDetails();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());

	}

}
