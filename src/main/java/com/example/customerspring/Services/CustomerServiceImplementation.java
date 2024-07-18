package com.example.customerspring.Services;

import com.example.customerspring.Dao.DaoCustomer;
import com.example.customerspring.model.Customer;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class CustomerServiceImplementation {
    private DaoCustomer daoCustomer;
    public CustomerServiceImplementation(DaoCustomer daoCustomer) {
        this.daoCustomer = daoCustomer;
    }
    public List<Customer> getAllCustomers() {
        return daoCustomer.finAllCustomers();

    }

    public Customer getCustomer(int id) {
        return daoCustomer.finCustomerById(id);
    }@Transactional
    public Customer addCustomer(Customer customer) {
        customer.setId(0);
        return daoCustomer.saveCustomer(customer);
        //  return customer;
    }@Transactional
    public Customer updateCustomer(int id,Customer customer) {
        customer.setId(id);
        return daoCustomer.saveCustomer(customer);

    }
}
