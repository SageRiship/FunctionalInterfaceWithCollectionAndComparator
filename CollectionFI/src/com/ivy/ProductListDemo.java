package com.ivy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> list = new ArrayList<Product>();
		
		list.add(new Product(101,"Apple","Mobile"));
		list.add(new Product(19,"Samsung","Tele"));
		list.add(new Product(54,"Vivo","Phone"));
		list.add(new Product(35,"Mi","Cell"));
		
//		Collections.sort(list, 
//				(Product p1,Product p2)->(p1.getPid() < p2.getPid())? -1:(p1.getPid() > p2.getPid())?1:0);

//		Collections.sort(list, 
//				(Product p1,Product p2)->(p1.getName().compareTo(p2.getName())));

		
		System.out.println(list);
	}

}
