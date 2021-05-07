package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoreJavaExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoreJavaExampleApplication.class, args);
		
		System.out.println();
		Constructors_Objects con_obj=new Constructors_Objects(101, "DIPC");
		con_obj.get();
		
		ArrayList list=new ArrayList();
		list.set();
		list.get();
		
		Mapping map=new Mapping();
		map.set();
		
		Interface obj=new Interface();
		obj.show();
		
		Linkedlist ll1=new Linkedlist();
		ll1.show();
		
	}

}
