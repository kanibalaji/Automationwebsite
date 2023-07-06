package org.collectiondemo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;



public class Demo {

	public static void main(String[] args) {
	
		List <String> list=new ArrayList<String>();
		list.add("Apple");
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		for(String eachFruit:list) {
			System.out.println(eachFruit);
			
			
		}
		list.remove("Apple");
		System.out.println("-------------");
		for(String eachFruit:list) {
			System.out.println(eachFruit);
			
		}
		System.out.println(list.hashCode());
		int size=list.size();
		System.out.println("size"+size);
		boolean contains=list.contains("Orange");
		System.out.println("contains"+contains);
		System.out.println("-------------------");
		System.out.println(list.contains("Mango"));
		list.clear();
		System.out.println(list.isEmpty());
		System.out.println("-----------------");
		
		
		Set<String>set=new HashSet<String>();
		set.add("Apple");
		set.add("Mango");
		set.add("Apple");
		set.add("Banana");
		set.add("Orange");
		for(String fruits:set) {
		System.out.println(fruits);
		System.out.println("------------------");
		Set <String>set1 =new TreeSet<String>();
		set1.add("Apple");
		set1.add("Mango");
		set1.add("Apple");
		set1.add("Banana");
		set1.add("Orange");
		for(String fruits1:set1) {
			System.out.println(fruits1);
		}
		System.out.println("---------------");
		List<String>mylist=new ArrayList<String>(set);
		for(String datas:mylist) {
			System.out.println(datas);
		}
		String string=mylist.get(1);
		System.out.println(string);
		// TODO Auto-generated method stub

	}

}

	

}


