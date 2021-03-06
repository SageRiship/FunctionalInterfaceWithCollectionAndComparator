package com.ivy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * ======================  Lambda Expressions with Collections =================
 
 
 --> Lambda Expression is used to write readable,maintainable,concide code 
      i.e. It will focus on less no.of lines code
 
 --> Functional Interface is used to call Lambda Expression
 
 Collections : group of individual objects stored into single entity
              1.List , 2.Set , 3.map
  
      List : a. Insertion order is preserved
             b. Duplicate objects are allowed
          e.g. 1.Arraylist 2.LinkedList 3.Vector
 
      Set : a. Insertion order is not preserved
             b. Duplicate objects are not not allowed
          e.g. 1. Hashset 2.Treeset
  
      Map : a. If we want represents group of Object is key value
   -------------------------------------------------------------------------|-------------------------------------------------------------------------   
      Comparable in Java													|	Comparator in Java
      --------------------------------------------------------------------- |-------------------------------------------------------------------------														
Comparable interface is used to sort the objects with natural ordering.	    |	Comparator in Java is used to sort attributes of different objects.
Comparable interface compares ?this? reference with the object specified.	|	Comparator in Java compares two different class objects provided.
Comparable is present in java.lang package.									|	A Comparator is present in the java.util package
 																			|	
																			|
.																			|
Comparable affects the original class, i.e., the actual class is modified.	|	Comparator doesn?t affect the original class
Comparable provides compareTo() method to sort elements.					|	Comparator provides compare() method, equals() method to sort elements.
 *------------------------------------------------------------------------------------------------------------------------------------------------------- 																			|
 */
class Employee{
	private int id;
	private String name ;
	private int salary;
	
	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Employee() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	 
	
}
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//				List<Integer> emp = new ArrayList<Integer>();
//		emp.add(132);
//		emp.add(232);
//		emp.add(431);
//		emp.add(99);
//		emp.add(87);
//		System.out.println(emp);
//		Collections.sort(emp);
//		System.out.println(emp);
		
		List<Employee> emp = new ArrayList<Employee>();

		emp.add(new Employee(3,"Roopam",30000));
		emp.add(new Employee(1,"Rushikesh",50000));
		emp.add(new Employee(2,"Yash",40000));
		emp.add(new Employee(5,"Ashwin",10000));
		emp.add(new Employee(4,"Sahil",20000));
		
//		Employee e = new Employee();
//		e.setId(1);
//		e.setName("Rushikesh");
//		e.setSalary(50000);
	
		//emp.add(e);
		
	    for (Employee ele : emp) {
	    	System.out.println(ele);
	    }
	    
	    //For sorting any  Object on the basis of object feild we should separate class for that implementing Comparator 
	    
	    Collections.sort(emp,new EmployeeIdComparator());
	    //Collections.sort(emp,new EmployeeNameComparator());
//	    Collections.sort(emp ,(o1, o2) -> (o1 > o2) ? -1 :
//            (o1 < o2) ? 1 : 0);
	    System.out.println("After Sorting");
	    for (Employee ele : emp) {
	    	System.out.println(ele);
	    }
	}
}
	
class EmployeeIdComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;
		
		if(e1.getId() == e2.getId()) {
			return 0 ;
		}else if(e1.getId() > e2.getId()){
			return 1;
		}else {
			return -1 ;
		}
//	
	//return e1.getId()> e2.getId() ? 1 :0 ;
}

}


class EmployeeNameComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;
		return e1.getName().compareTo(e2.getName());
	}
	
}