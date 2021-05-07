package com.example;

import java.util.List;

public class ArrayList {

	List<String> arrlist=new java.util.ArrayList<>();
	
	public void set(){
		arrlist.add("Mitva");
		arrlist.add("Shah");
	}
	
	public void get()
	{
		for(String str:arrlist)
			System.out.print(str);
		
		System.out.println();
	}
		
}
