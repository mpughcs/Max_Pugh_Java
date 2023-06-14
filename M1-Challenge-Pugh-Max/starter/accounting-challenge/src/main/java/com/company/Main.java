package com.company;

import java.util.*;

public class Main {


    private static List<String[]> customerData = Arrays.asList(
            new String[] {"1","Wayne Enterprises","10000","12-01-2021"},
            new String[] {"2","Daily Planet","-7500","01-10-2022"},
            new String[] {"1","Wayne Enterprises","18000","12-22-2021"},
            new String[] {"3","Ace Chemical","-48000","01-10-2022"},
            new String[] {"3","Ace Chemical","-95000","12-15-2021"},
            new String[] {"1","Wayne Enterprises","175000","01-01-2022"},
            new String[] {"1","Wayne Enterprises","-35000","12-09-2021"},
            new String[] {"1","Wayne Enterprises","-64000","01-17-2022"},
            new String[] {"3","Ace Chemical","70000","12-29-2022"},
            new String[] {"2","Daily Planet","56000","12-13-2022"},
            new String[] {"2","Daily Planet","-33000","01-07-2022"},
            new String[] {"1","Wayne Enterprises","10000","12-01-2021"},
            new String[] {"2","Daily Planet","33000","01-17-2022"},
            new String[] {"3","Ace Chemical","140000","01-25-2022"},
            new String[] {"2","Daily Planet","5000","12-12-2022"},
            new String[] {"3","Ace Chemical","-82000","01-03-2022"},
            new String[] {"1","Wayne Enterprises","10000","12-01-2021"}
    );

    public static void main(String[] args) {
        /*
        Iterate through a List<String[]> that contains multiple records for each Customer,
        converting it into List<Customer> where there is only one copy of each customer
        (Integer.parseInt() converts a String to an integer).
         */


        List<Customer> customerList= new ArrayList<>();

        for (String[] thisCustomerInfo : customerData) {
            int customerId = Integer.parseInt(thisCustomerInfo[0]);
            String customerName = thisCustomerInfo[1];
            int charge = Integer.parseInt(thisCustomerInfo[2]);
            String chargeDate = thisCustomerInfo[3];
            AccountRecord thisAccountRecord = new AccountRecord();
            thisAccountRecord.setCharge(charge);
            thisAccountRecord.setChargeDate(chargeDate);

            Iterator<Customer> customerIterator = customerList.iterator();
            boolean customerExists = false;

//            Scrub through the list of customers and if the id matches the current customers id, aggregate their charges
            while (customerIterator.hasNext()) {
                Customer customer = customerIterator.next();
                if (customer.getId() == customerId) {
                    customer.getCharges().add(thisAccountRecord);
                    customerExists = true;
                    break;
                }
            }
//            if the customer id doesn't match any of customers in the list , add them to the list, and set their attributes.
            if (!customerExists) {
                Customer newCustomer = new Customer();
                newCustomer.setId(customerId);
                newCustomer.setName(customerName);
                newCustomer.getCharges().add(thisAccountRecord);
                customerList.add(newCustomer);
            }
        }


        System.out.println("Positive Accounts");
        for(Customer customer :customerList){
            if(customer.getBalance()>=0){
                System.out.println(customer);
            }
        }
        System.out.println("Negative Accounts");
        for(Customer customer :customerList){
            if(customer.getBalance()<=0){
                System.out.println(customer);
            }
        }




    }
}
