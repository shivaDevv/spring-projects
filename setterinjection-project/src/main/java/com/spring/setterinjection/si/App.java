package com.spring.setterinjection.si;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        //creating spring container
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/setterinjection/si/configmetadata.xml");
    	
    	//get customer object
    	/*Customer customer = (Customer) context.getBean("cus");
    	
    	System.out.println("Name: "+customer.getName());
    	System.out.println("Contact: "+customer.getContact());
    	System.out.println("Address: "+customer.getAddress());*/
    	
    	
    	Order order = (Order) context.getBean("ord");
    	
    	System.out.println("Product Id: "+order.getProductId());
    	System.out.println("Product Name: "+order.getProductName());
    	System.out.println("Customer Name: "+order.getCustomer().getName());

    	
    	
    }
}
