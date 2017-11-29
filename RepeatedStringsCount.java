package com.strings;

import java.util.HashMap;
import java.util.Map;

public class RepeatedStringsCount {

	public static void main(String[] args) {
		repeatedCharGroup("rain rain come again","rain",4);
		repeatedCharGroup("rainraincomeagain","rain",4);
		byMap("rain rain rain7");
	}
	public static void byMap(String str){
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		String[] strArr=str.split(" ");
		for(String str1:strArr){
			if(map.containsKey(str1)){
				map.put(str1, map.get(str1)+1);
			}else
			{
				map.put(str1, 1);
			}
		}
		for(Map.Entry<String, Integer>map1:map.entrySet()){
			System.out.println(map1.getKey()+"---"+map1.getValue());
		}
	}
	public static void repeatedCharGroup(String str,String substring,int charSize){
		int length = str.length();
		int count =0;
		for(int i=0;i<=length-charSize;i++){
			if(str.substring(i,i+charSize).equalsIgnoreCase(substring)){
				count =count+1;
			}
		}
		System.out.println("No of repeated substring "+count);
	}
}
