package com.Resta.RestaManagement.Repository;

import com.Resta.RestaManagement.Module.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
