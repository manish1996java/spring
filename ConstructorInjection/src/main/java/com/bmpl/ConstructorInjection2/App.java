package com.bmpl.ConstructorInjection2;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
//      load config file
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
    	
    	
//    	retrive bean
//    	A a = context.getBean("classA",A.class);
//    	data type is z for switch different implementation
    	Z z = context.getBean("classA",Z.class);
    	
    	//call method
    	System.out.println(z.print());
    	
    	//call method
    	System.out.println(z.show());
    	
    	//close context
    	context.close();
    	
    }
}
