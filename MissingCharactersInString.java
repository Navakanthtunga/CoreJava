package com.strings;

import java.util.Arrays;

public class MissingCharactersInString {
	public static void main(String[] args) {
		String str="abnsAAAAAAKJSDFHKBHUI*/*/*/*/OWESDFNJYTOJGHJKHDFK";
		//str=str.toLowerCase();
		//str=str.toUpperCase();
		/*
		 * The purpose of above two lines is to bring the string into one case,
		 * if not there are chances to get special characters in output 
		 */
		str=str.replaceAll("[^a-z]", "");
		/*
		 * The purpose of above function is to remove all the characters apart from a-z 
		 */
		System.out.println(str);
		char[] charArr=str.toCharArray();
		Arrays.sort(charArr);
		System.out.println("strating at "+charArr[0]+" to "+charArr[charArr.length-1]);
		for (int i = 0; i < charArr.length-1; i++) {
			int diff=charArr[i+1]-charArr[i];
			if(diff>1){
				for (int j = 0; j < diff; j++) {
					char c=(char) (charArr[i]+j); // 
					System.out.print(c);
				}
			}
		}
	}
}