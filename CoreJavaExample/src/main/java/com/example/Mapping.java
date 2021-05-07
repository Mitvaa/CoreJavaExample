package com.example;

import java.util.HashMap;
import java.util.Map;

public class Mapping {
	Map<Integer, String> hashmap=new HashMap<>();
	
	public void set()
	{
	hashmap.put(1,"Java");
	hashmap.put(2,"Struts");
	hashmap.put(3,"Spring");
	hashmap.put(4,"Hibernate");
	System.out.println(hashmap);
	}

}
