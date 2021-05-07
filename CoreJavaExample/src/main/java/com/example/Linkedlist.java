package com.example;

import java.util.LinkedList;

public class Linkedlist {
	
	LinkedList<String> ll=new LinkedList<>();
	
	public void show()
	{
		System.out.println("Adding to the linked list");
		ll.add("June 8,2000");
		ll.addFirst("Female");
		ll.add(2, "PostGraduate");
		
		System.out.println("removing from the linked list");
		ll.remove("Female");
		ll.remove(1);
		
		ll.addLast("PostGraduate");
		System.out.println("Updating the linked list");
		ll.set(1,"Graduate");
		
		System.out.println("Linked list:");
		for (String str : ll) 
            System.out.println(str); 
		
		
	}
	
}
