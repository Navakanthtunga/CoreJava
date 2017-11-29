package com.strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedWordsorCharCountNew {
	public static void main(String[] args) {
		String str="Manual Testing Software Testing";
		String[] strArr=str.split(" ");
		List<String> list=Arrays.asList(strArr);
		Set<String> set= new HashSet<String>(list);
		for(String strRef: set){
			System.out.println(strRef+"----"+Collections.frequency(list, strRef));
		}
		String str1="ManualTestingSoftwareTesting";
		String[] charArr=str1.split("");
		List<String> list1=Arrays.asList(charArr);
		Set<String> set1= new HashSet<String>(list1);
		for(String strRef: set1){
			System.out.println(strRef +"----"+Collections.frequency(list1, strRef));
		}
	}
}