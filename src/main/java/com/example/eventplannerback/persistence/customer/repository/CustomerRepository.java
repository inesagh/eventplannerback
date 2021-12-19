package com.example.eventplannerback.persistence.customer.repository;

import com.example.eventplannerback.persistence.customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByUserName(String userName);
}
