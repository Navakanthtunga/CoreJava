package com.strings;

public class Reverse_String {
	public static void main(String[] args) {

		//		checkStrings("adasfsfd");
		//
		//		checkChar("madam");

		//System.out.println(isPalindromeString("IIII"));
		
		System.out.println(isPalindrome("pIIYYII"));
	}
	public static void checkStrings(String str1){
		String str2="";
		for(int i=str1.length()-1;i>=0;i--){
			str2=str2+str1.charAt(i);
		}
		System.out.println(str2);
		if(str1.equalsIgnoreCase(str2)){
			System.out.println("Both the strings are equal");
		}
		else{
			System.out.println("Both the strings are not equal");
		}
	}
	public static void checkChar(String str1){
		for(int i=0;i<str1.length();i++){
			if(str1.charAt(i)==str1.charAt(str1.length()-(i+1))){
				System.out.println("Characters are equal");
			}
			else
			{
				System.out.println("Characters are not equal");
			}
		}
	}
	public static boolean isPalindromeString(String str) {
		if (str == null)
			return false;
		int length = str.length();
		System.out.println(length / 2);
		for (int i = 0; i < length / 2; i++) {

			if (str.charAt(i) != str.charAt(length - i - 1))
				return false;
		}
		return true;
	}
	public static boolean isPalindrome(String str) {
		if (str == null)
			return false;
		StringBuilder strBuilder = new StringBuilder(str);
		strBuilder.reverse();
		System.out.println(strBuilder);
		return strBuilder.toString().equals(str);
	}
}
