package com.company.customerdataservice.repository;

import static org.junit.jupiter.api.Assertions.*;

import com.company.customerdataservice.model.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
//
@SpringBootTest
class CustomerRepositoryTest {
//    Implements the following functionality and includes tests:
//
//Create a new customer record. 5 pts
//
//Update an existing customer record. 5 pts
//
//Delete an existing customer record. 5 pts
//
//Find a customer record by id. 5 pts
//
//Find customer records by state. 5 pts
    Customer c = new Customer();


    @Autowired
    CustomerRepository repo;

    @BeforeEach
    public void setUp() throws Exception{
        repo.deleteAll();
        c.setFirstName("John");
        c.setLastName("Doe");
        c.setEmail("john.doe@example.com");
        c.setCompany("Example Company");
        c.setPhoneNumber("123-456-7890");
        c.setAddress1("123 Main St");
        c.setAddress2("Apt 4B");
        c.setCity("Anytown");
        c.setState("AnyState");
        c.setPostalCode("12345");
        c.setCountry("AnyCountry");
    }


    @Test
    public void shouldCreateNewCustomer(){
        repo.save(c);
        Optional<Customer> c1 = repo.findById(c.getId());
        assertEquals(c1.get(), c);

    }
    @Test
    public void shouldUpdateCustomer(){
        repo.save(c);
        Customer updatedCustomer = new Customer();
        updatedCustomer.setFirstName("Johnson");
        updatedCustomer.setLastName("Doe");
        updatedCustomer.setCompany("Example Company");
        updatedCustomer.setEmail("john.doe@example.com");
        updatedCustomer.setPhoneNumber("123-456-7890");
        updatedCustomer.setAddress1("123 Main St");
        updatedCustomer.setAddress2("Apt 4B");
        updatedCustomer.setCity("Anytown");
        updatedCustomer.setState("AnyState");
        updatedCustomer.setPostalCode("12345");
        updatedCustomer.setCountry("AnyCountry");
        updatedCustomer.setId(c.getId());

        // Save the updated customer into the database
        repo.save(updatedCustomer);

        // Retrieve the customer from the database to ensure changes are persisted
        Optional<Customer> retrievedCustomer = repo.findById(c.getId());

        // Perform the assertion
        assertEquals(updatedCustomer, retrievedCustomer.get());
    }

    @Test
    public void shouldDeleteCustomer(){
        repo.save(c);

//        make sure customer exists
        Optional<Customer> retrievedCustomerOptional = repo.findById(c.getId());

        // Perform the assertion to check if the customer exists before deletion
        assertTrue(retrievedCustomerOptional.isPresent(), "Customer should exist before deletion");

        // Delete the customer from the database
        repo.delete(c);

        // Try to retrieve the customer after deletion
        retrievedCustomerOptional = repo.findById(c.getId());

        // Perform the assertion to check if the customer is deleted
        assertFalse(retrievedCustomerOptional.isPresent(), "Customer should be deleted");
    }


//    QUESTION: HOW WOULD THIS TEST DIFFER FROM CREATING AN
//    @Test
//    public void shouldFindCustomerById(){
//        repo.save(c);
//
//        Optional<Customer> retrievedCustomerOptional = repo.findById(c.getId());
//
//
//
//    }




    }










