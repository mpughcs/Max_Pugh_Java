package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

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
            if (thisCustomerInfo[0].equals("1")) {
//              store necessary variables
                AccountRecord thisAccountRecord = new AccountRecord();
                thisAccountRecord.setCharge(Integer.parseInt(thisCustomerInfo[2]));
                thisAccountRecord.setChargeDate(thisCustomerInfo[3]);

//                if the id doens't already exist, we create a new customer
                if (customerList.stream().noneMatch(cust -> cust.getId() == 1)) {
                    Customer c1 = new Customer();
                    c1.setId(Integer.parseInt(thisCustomerInfo[0]));
                    c1.setName(thisCustomerInfo[1]);
                    c1.getCharges().add(thisAccountRecord);
                    customerList.add(c1);
                } else {
                    customerList.get(0).getCharges().add(thisAccountRecord);
                }

//                get the sum,date of each record and add it to the coorisponding List<AccountRecord> charges
            }
            if (thisCustomerInfo[0].equals("2")) {
//              store necessary variables
                AccountRecord thisAccountRecord = new AccountRecord();
                thisAccountRecord.setCharge(Integer.parseInt(thisCustomerInfo[2]));
                thisAccountRecord.setChargeDate(thisCustomerInfo[3]);

//                if the id doens't already exist, we create a new customer
                if (customerList.stream().noneMatch(cust -> cust.getId() == 2)) {
                    Customer c1 = new Customer();
                    c1.setId(Integer.parseInt(thisCustomerInfo[0]));
                    c1.setName(thisCustomerInfo[1]);
                    c1.getCharges().add(thisAccountRecord);
                    customerList.add(c1);
                } else {
                    customerList.get(1).getCharges().add(thisAccountRecord);
                }

//                get the sum,date of each record and add it to the coorisponding List<AccountRecord> charges
            }
            if (thisCustomerInfo[0].equals("3")) {
//              store necessary variables
                AccountRecord thisAccountRecord = new AccountRecord();
                thisAccountRecord.setCharge(Integer.parseInt(thisCustomerInfo[2]));
                thisAccountRecord.setChargeDate(thisCustomerInfo[3]);

//                if the id doens't already exist, we create a new customer
                if (customerList.stream().noneMatch(cust -> cust.getId() == 3)) {
                    Customer c1 = new Customer();
                    c1.setId(Integer.parseInt(thisCustomerInfo[0]));
                    c1.setName(thisCustomerInfo[1]);
                    c1.getCharges().add(thisAccountRecord);
                    customerList.add(c1);
                } else {
                    customerList.get(2).getCharges().add(thisAccountRecord);
                }

            }


        }
//        System.out.println(customerList.get(2).getCharges().size());
//        this print loop prints the name of each customer folowed by the date of each of their purchase records
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
