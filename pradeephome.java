package com.programs.javaprograms;

public class pradeephome {
	
	String  thing1="fan";
	
	String  thing2=" water supply";// non local variable;
	
	static String  thing3="public water supply";//Global Variable 
	
	public void Rental() {
		
		String rentalthing="AC";   ////local variable 
		
		System.out.println("GIven home for Rent ");
		
		System.out.println("GIven fan as rent "+thing1);
		
		System.out.println("given water supply"+thing2);
		
		System.out.println(" Rental own AC"+ rentalthing);
		
	}
	
	public static void show() {
		System.out.println("your children and wife");
	}
	
	public static void main(String[] args) {
		
		pradeephome obj= new pradeephome();
		
		obj.Rental();
		
		show();	
		
		System.out.println(thing3);
		

	}

}
