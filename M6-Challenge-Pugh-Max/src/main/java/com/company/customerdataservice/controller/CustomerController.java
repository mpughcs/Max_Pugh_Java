package com.company.customerdataservice.controller;


import com.company.customerdataservice.model.Customer;
import com.company.customerdataservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {


    @Autowired
    CustomerRepository repo;

//   C REATE

//        As a user, I would like to be able to add new customers

    @PostMapping("/customers")
    @ResponseStatus(HttpStatus.CREATED)
    public Customer addCustomer(@RequestBody Customer customer){return repo.save(customer);}

//    R EAD
//    read all
    @GetMapping("/customers")
    @ResponseStatus(HttpStatus.OK)
    public List<Customer> getCustomers(){return repo.findAll();}

//    Read By ID
    @GetMapping("/customers/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Customer getCustomerById(@PathVariable int id){
        Optional<Customer> toReturn = repo.findById(id);
        if(toReturn.isPresent()){
            return toReturn.get();
        } else{
            return null;
        }
    }



//    U PDATE
    @PutMapping("/customers/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Customer updateCustomer(@PathVariable int id, @RequestBody Customer updatedCustomer) {
        Optional<Customer> optionalCustomer = repo.findById(id);
        if (optionalCustomer.isPresent()) {
            Customer customerToUpdate = optionalCustomer.get();
            customerToUpdate.setFirstName(updatedCustomer.getFirstName());
            customerToUpdate.setLastName(updatedCustomer.getLastName());
            customerToUpdate.setEmail(updatedCustomer.getEmail());
            customerToUpdate.setCompany(updatedCustomer.getCompany());
            customerToUpdate.setPhoneNumber(updatedCustomer.getPhoneNumber());
            customerToUpdate.setAddress1(updatedCustomer.getAddress1());
            customerToUpdate.setAddress2(updatedCustomer.getAddress2());
            customerToUpdate.setCity(updatedCustomer.getCity());
            customerToUpdate.setState(updatedCustomer.getState());
            customerToUpdate.setPostalCode(updatedCustomer.getPostalCode());
            customerToUpdate.setCountry(updatedCustomer.getCountry());
            return repo.save(customerToUpdate);
        } else {
            return null;
        }
    }


//    D ELETE
    @DeleteMapping("/customers/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCustomer(@PathVariable int id){
        repo.deleteById(id);
    }




//    Custom queries
    /*
    As a user, I would like to be able to filter customers by state.

     */
    @GetMapping("/customers/state/{state}")
    @ResponseStatus(HttpStatus.OK)
    public List<Customer> findByState(@PathVariable String state){
        return repo.findByState(state);
    }

}
