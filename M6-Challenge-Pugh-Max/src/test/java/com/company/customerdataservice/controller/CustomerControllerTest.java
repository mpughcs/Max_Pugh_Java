package com.company.customerdataservice.controller;

import com.company.customerdataservice.model.Customer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(CustomerController.class)
class CustomerControllerTest {
//    @Autowired
//    private MockMvc mockmvc;
//    private ObjectMapper mapper = new ObjectMapper();
//
//    @Test
//    void shouldAddNewCustomer() throws Exception {
//        Customer c = new Customer();
//        String inputJson = mapper.writeValueAsString(c);
//
//        mockmvc.perform(
//                        post("/customers")
//                                .content(inputJson)
//                                .contentType(MediaType.APPLICATION_JSON))
//                .andDo(print())
//                .andExpect(status().isCreated());
//    }
//
//    @Test
//    void getCustomers() {
//    }
//
//    @Test
//    void getCustomerById() {
//    }
//
//    @Test
//    void updateCustomer() {
//    }
//
//    @Test
//    void deleteCustomer() {
//    }
//
//    @Test
//    void findByState() {
//    }
}