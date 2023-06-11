package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {
    Customer c1;

    @BeforeEach
    void setUp() {
        c1 = new Customer();
        c1.setId(1);
        c1.setName("John Doe");
        List<AccountRecord> charges = c1.getCharges();
        int count=0;
        while(count<3){
            charges.add(new AccountRecord());
            count++;
        }
        charges.get(0).setCharge(100);
        charges.get(1).setCharge(20);
        charges.get(2).setCharge(-20);
    }

    @Test
    void testToString() {
        String expected = "Customer_ID: 1, Customer_Name: John Doe, Customer_balance: 100";
        String actual = c1.toString();
        assertEquals(expected, actual);
    }

    @Test
    void testGetBalance() {
        int expected = 100;
        int actual = c1.getBalance();
        assertEquals(expected, actual);
    }
}
