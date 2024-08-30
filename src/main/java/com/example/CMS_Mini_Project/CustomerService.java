package com.example.CMS_Mini_Project;

public interface CustomerService {

        void addCustomer(Customer customer);

        Customer getCustomer(int id);

        void updateCustomer(Customer customer);

        void deleteCustomer(int id);

}
