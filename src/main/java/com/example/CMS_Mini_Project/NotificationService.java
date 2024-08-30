package com.example.CMS_Mini_Project;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void sendNotification(Customer customer) {
        System.out.println("Sending email to: " + customer.getEmail());
    }
}
