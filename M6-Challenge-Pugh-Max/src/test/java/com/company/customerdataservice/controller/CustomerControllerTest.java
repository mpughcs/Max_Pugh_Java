package com.company.customerdataservice.controller;

import com.company.customerdataservice.model.Customer;
import com.company.customerdataservice.repository.CustomerRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@WebMvcTest(CustomerController.class)
class CustomerControllerTest {
    @Autowired
    private MockMvc mockmvc;

    @Autowired
    private ObjectMapper mapper = new ObjectMapper();

    @MockBean
    private CustomerRepository repo;

    Customer c = new Customer();

    String inputJson;

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
        inputJson = mapper.writeValueAsString(c);

    }

    @Test
    void shouldCreateNewCustomer() throws Exception {
        mockmvc.perform(
                        post("/customers")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isCreated());
    }
    @Test
    void updateCustomer() throws Exception {
//        String inputJson = mapper.writeValueAsString(c);
        mockmvc.perform(
                put("/customers/{id}", c.getId())
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                        .andDo(print())
                        .andExpect(status().isNoContent());

    }


    @Test
    void getCustomers() throws Exception {
        mockmvc.perform(get("/customers"))
                .andDo(print())             //Print results
                .andExpect(status().isOk()); //Assert (code is 200)
    }

    @Test
    void getCustomerById() throws Exception {
        mockmvc.perform(get("/customers/{id}",c.getId()))
                .andDo(print())
                .andExpect(status().isOk());
    }


    @Test
    void deleteCustomer() throws Exception{
        mockmvc.perform(delete("/customers/{id}", c.getId()))
                .andDo(print())
                .andExpect(status().isNoContent());

    }

    @Test
    void findByState() throws Exception {
        mockmvc.perform(get("/customers/state/{state}",c.getState()))
                .andDo(print())
                .andExpect(status().isOk());

    }
}