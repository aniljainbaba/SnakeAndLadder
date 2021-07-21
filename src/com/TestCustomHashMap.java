package com;

import java.util.Iterator;

public class TestCustomHashMap {
	public static void main(String[] args) {
		CustomHashMap<String, Integer> customMap = new CustomHashMap<>();
		customMap.add("anil", 1);
		customMap.add("coder", 2);
		customMap.add("this", 4);
		customMap.add("lina", 5);
		customMap.add("jain", 5);
		
		
		//display all the items of custom hashmap
		for(int i = 0; i < customMap.bucketArray.size(); i++) {
			Item <String, Integer> item = customMap.bucketArray.get(i);
			
			
			if(item != null) {
				System.out.println("");
				System.out.println("=>" + item.key);
				Item <String, Integer> curr = item;
				while(curr.next != null) {
					System.out.print("    ->" + curr.next.key);
					curr = curr.next;
				}
			}
		}
		
		
		
		
	}//end main
}//end class
