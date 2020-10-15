package com.handson5b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		ApplicationContext context= new AnnotationConfigApplicationContext(OwnerConfig.class);
		
		Owner owner= context.getBean(Owner.class);
		
		System.out.println("Enter the details of user:");
		System.out.println("Name: ");
		String name= reader.readLine();
		System.out.println("Password: ");
		String password= reader.readLine();
		System.out.println("Mobile Number: ");
		String mobileNumber= reader.readLine();
		
		owner.setDetails(name, password, mobileNumber);
		System.out.println("\nOwner Details are:");
		owner.display();
		((AnnotationConfigApplicationContext)context).close();
	}

}
