package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/springcore/standalone/collections/aloneconfig.xml");
		Person per1 = context.getBean("person1", Person.class);
		System.out.println(per1);
		System.out.println(per1.getFriends().getClass().getName());
		System.out.println("+++++++++++++++++++++");
		System.out.println(per1.getFeeStructure().getClass().getName());
		System.out.println("+++++++++++++++++++++");
		System.out.println(per1.getProperties());
	}

}
