package com.ecommers.reposiroty;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommers.entity.Customer;

public interface CustomerRepository
        extends JpaRepository<Customer, Long> {
}