package com.ivy;

import java.util.ArrayList;
import java.util.List;

public class ListStringDemo {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("hyderabad");
		list.add("nashik");
		list.add("banglore");
		list.add("pune");
		list.add("mumbai");
		
		list.sort((i1,i2)->i1.compareTo(i2));
		
		System.out.println("Sorted order is : "+list);
	}
}
