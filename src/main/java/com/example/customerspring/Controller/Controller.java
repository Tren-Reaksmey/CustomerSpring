package com.example.customerspring.Controller;

import com.example.customerspring.Services.CustomerServiceImplementation;
import com.example.customerspring.model.Customer;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class Controller {
    public CustomerServiceImplementation customerService;

    public Controller(CustomerServiceImplementation customerService) {
        this.customerService = customerService;
    }
    @GetMapping()
    public List<Customer> getCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable int id) {
        return customerService.getCustomer(id);
    }
    @Transactional
    @PostMapping()
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }
    @Transactional
    @PutMapping("/{id}")
    public Customer updateCustomer(@PathVariable int id, @RequestBody Customer customer) {
        return customerService.updateCustomer(id, customer);
    }
}
