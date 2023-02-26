package com.spring.ci.constructorinjection_project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	//Create spring container
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/ci/constructorinjection_project/configmetadata.xml");
    	
    	//Get customer object
    	Customer customer = (Customer) context.getBean("cus");
    	
    	System.out.println("Customer Details :"+customer.toString());
    	
    	
    	Order order = (Order) context.getBean("ord");
    	System.out.println("Order Details :"+order.toString());

    }
}
