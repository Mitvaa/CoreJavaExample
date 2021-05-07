package com.example;

interface university{
	
	String uni_name="Gujarat_University";
	public void show();
}

public class Interface implements university{

		String clg_name="K.S. School of Business Management";
		
		public void show(){
			System.out.println(uni_name + "\n"+  clg_name);
		}
}
