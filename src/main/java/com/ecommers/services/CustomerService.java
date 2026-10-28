package com.ecommers.services;


import org.springframework.stereotype.Service;

import com.ecommers.entity.Customer;
import com.ecommers.reposiroty.CustomerRepository;
import com.ecommers.request.CustomerRequest;
import com.ecommers.response.CustomerResponse;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerResponse registerCustomer(CustomerRequest request) {

        Customer customer = new Customer();

        customer.setName(request.getName());
        customer.setEmail(request.getEmail());
        customer.setPhone(request.getPhone());

        Customer savedCustomer = customerRepository.save(customer);

        return new CustomerResponse(
                savedCustomer.getId(),
                savedCustomer.getName(),
                savedCustomer.getEmail(),
                savedCustomer.getPhone()
        );
    }
}
