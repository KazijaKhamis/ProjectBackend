package com.Resta.RestaManagement.Controller;

import com.Resta.RestaManagement.Exception.ResourceNotFoundException;
import com.Resta.RestaManagement.Module.Customer;
import com.Resta.RestaManagement.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/cus")

public class CustomerController {

    @Autowired
    public CustomerRepository customerRepository;
    @GetMapping("/customer")
    private List<Customer>viewCustomer(){
        return customerRepository.findAll();
    }

    @PostMapping("/customer")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerRepository.save(customer);
    }

    @GetMapping("/customer/{id}")
    public ResponseEntity<Customer> getCustomerByID(@PathVariable int id) {
        Customer customer = customerRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Invalid Id: " + id));
        return ResponseEntity.ok(customer);
    }

    @DeleteMapping("/customer/{id}")
    public ResponseEntity<Map<String,Boolean>> deleteCustomer(@PathVariable int id)
    {
        //finding the customer with  provided id
        Customer customer = customerRepository.findById(id)

                // throw resource not found exception if not found
                .orElseThrow(() -> new ResourceNotFoundException("Invalid Id: "+id));

        // deleting the customer if found
        customerRepository.delete(customer);

        // display message for success deletion
        Map<String,Boolean> response = new HashMap<>();
        response.put("customer was Deleted : ",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @PutMapping("/customer/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable int id, @RequestBody Customer customer)
    {

        Customer customer1 = customerRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Invalid Id: "+id));

        customer1.setCustomer_ID(customer1.getCustomer_ID());
        customer1.setEmail(customer1.getEmail());
        customer1.setCus_Name(customer1.getCus_Name());
        customer1.setFood_Name(customer1.getFood_Name());
        customer1.setPhone_no(customer1.getPhone_no());

        // saving the new values

        return ResponseEntity.ok(customerRepository.save(customer1));
    }

}



