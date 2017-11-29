package com.strings;

public class RemovingJunkcharacters {
	public static void main(String[] args) {
		String str="qrowetudfsl@@@###$$$$";
		str=str.replaceAll("[^a-zA-B0-9]", "");
		System.out.println(str);
	}
}
