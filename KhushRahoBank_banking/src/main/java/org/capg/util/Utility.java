package org.capg.util;

public class Utility {
	public static int generateNumber() {
		return (int)(Math.random()*1000/100);
	}
	
	
	public static boolean isValidName(String name) {
		return name.matches("[a-zA-z]{3,}");
		
	}

	public static boolean isValidMobile(String mob) {
		
		return mob.matches("[0-9]{0,10}");
		
	}
	
	public static boolean isValidEmail(String email) {
		
		return email.matches("[0-9a-z]+@[a-z]+.com");
		
	}
	
	public static boolean isValidPincode(String pincode) {
		return pincode.matches("[0-9]{0,6}");
	}
	
	public static boolean isValidDateOfBirth(String dob) {
		return dob.matches("[0,1,2,3]\\d{1}-[0,1]\\d{1}-(18|19|20)\\d{2}");
	}

}
