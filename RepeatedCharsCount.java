package com.strings;

import java.util.HashMap;
import java.util.Map;

public class RepeatedCharsCount {
	public static void main(String[] args) {
		String s1="abbccddddsss";
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		char[] chArr = s1.toCharArray();
		for(char ch:chArr){
			if(hm.containsKey(ch)){
				hm.put(ch, hm.get(ch)+1);
			}else
				hm.put(ch, 1);
		}
		for(Map.Entry<Character, Integer> val:hm.entrySet()){
			System.out.print(val.getValue()+""+val.getKey()+" ");
		}
	}
}
