package com.example.customerspring.Dao;

import com.example.customerspring.model.Customer;

import java.util.List;

public interface DaoCustomer {

    List<Customer> finAllCustomers();
    Customer finCustomerById(int id);
    Customer saveCustomer(Customer customer);
}
