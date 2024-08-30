package com.example.CMS_Mini_Project;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CmsMiniProjectApplication {

	public static void main(String[] args) {
		// Initialize the Spring IoC container
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		// Retrieve the CustomerService bean
		CustomerService customerService = context.getBean(CustomerService.class);

		// Create a new customer
		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setName("John Doe");
		customer1.setEmail("john.doe@example.com");
		customer1.setPhone("123-456-7890");

		// Add the customer
		customerService.addCustomer(customer1);

		// Retrieve the customer
		Customer retrievedCustomer = customerService.getCustomer(1);
		System.out.println("Retrieved Customer: " + retrievedCustomer);

		// Update the customer
		customer1.setName("John Doe Jr.");
		customerService.updateCustomer(customer1);

		// Delete the customer
		customerService.deleteCustomer(1);

		// Close the context
		context.close();
	}

}
