package com.example.CMS_Mini_Project;

import com.example.CMS_Mini_Project.Customer;
import com.example.CMS_Mini_Project.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private List<Customer> customerDatabase = new ArrayList<>();
    private Customer customer;
    private NotificationService notificationService;

    @Autowired
    public CustomerServiceImpl(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Autowired
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void addCustomer(Customer customer) {
        customerDatabase.add(customer);
        System.out.println("Customer added: " + customer);
        notificationService.sendNotification(customer);
    }

    @Override
    public Customer getCustomer(int id) {
        for (Customer c : customerDatabase) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    @Override
    public void updateCustomer(Customer customer) {
        for (int i = 0; i < customerDatabase.size(); i++) {
            if (customerDatabase.get(i).getId() == customer.getId()) {
                customerDatabase.set(i, customer);
                System.out.println("Customer updated: " + customer);
                return;
            }
        }
        System.out.println("Customer with ID " + customer.getId() + " not found.");
    }

    @Override
    public void deleteCustomer(int id) {
        for (int i = 0; i < customerDatabase.size(); i++) {
            if (customerDatabase.get(i).getId() == id) {
                customerDatabase.remove(i);
                System.out.println("Customer with ID " + id + " deleted.");
                return;
            }
        }
        System.out.println("Customer with ID " + id + " not found.");
    }
}
