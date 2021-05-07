package com.example;

public class Constructors_Objects {

	private int id;
	private String company;
	public Constructors_Objects(int id, String company) {
		super();
		this.id = id;
		this.company = company;
	}
	
	public void get()
	{
		System.out.println(id+" - "+company);
	}
}
