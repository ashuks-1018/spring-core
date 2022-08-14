package com.springcore.stereo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/springcore/stereo/stereoconfig.xml");
//		Student st = context.getBean("student", Student.class);
//		System.out.println(st);
//		System.out.println(st.getAddresses());
//		System.out.println(st.getAddresses().getClass().getName());
//		System.out.println(st.hashCode());
//		
//		Student st2 = context.getBean("student", Student.class);
//		System.out.println(st2.hashCode());
		
		Teacher teach = context.getBean("teacher", Teacher.class);
		System.out.println(teach.hashCode());
		
		Teacher teach2 = context.getBean("teacher", Teacher.class);
		System.out.println(teach2.hashCode());
	}

}
