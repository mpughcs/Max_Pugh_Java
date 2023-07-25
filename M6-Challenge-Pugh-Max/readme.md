# Customer Data Service - Spring Boot REST API

This project is a Spring Boot-based REST API that tracks customer data using Spring Data JPA and connects to a MySQL database. The primary goal of this challenge is to reinforce knowledge of Spring Data JPA by manipulating relational data and setting up a REST API for customer data management.

## Goals

The main objectives of this challenge are as follows:

1. Automatically create a MySQL database using Spring Data JPA.
2. Manipulate relational data using Spring Data JPA.
3. Configure a Spring Boot project to connect with a MySQL database.
4. Set up and execute unit/integration tests for Spring Data JPA.

# Customer Data Service - Spring Boot REST API


## Requirements/Features

Your application must track the following data for each customer:

- [x] Customer Id
- [x] First name
- [x] Last name
- [x] Email
- [x] Company
- [x] Phone
- [x] Address 1
- [x] Address 2
- [x] City
- [x] State
- [x] Postal code
- [x] Country

The REST API must have the following features:

- [x] Create a new customer record.
- [x] Update an existing customer record.
- [x] Delete an existing customer record.
- [x] Find a customer record by id.
- [x] Find customer records by state.

## User Stories

Your application must fulfill the following user stories:

- [x] As a user, I would like to be able to filter customers by state.
- [x] As a user, I would like to be able to find a specific customer by id.
- [x] As a user, I would like to be able to delete customers.
- [x] As a user, I would like to be able to edit customers.
- [x] As a user, I would like to be able to add new customers.

## Submission

When you have completed your challenge, copy your completed `M6-Challenge-Lastname-Firstname` folder into your personal GitHub repository, commit, and push to GitHub.

## Grading Requirements

In this challenge, your grade will be based on the following criteria:

### General Setup and Format Requirements (15 pts)

- [x] Your challenge is in a folder named `M6-Challenge-Lastname-Firstname`. (3 pts)
- [x] Your code is clean and follows general patterns as presented in class. (3 pts)
- [x] Your challenge is built using Spring Boot, Spring Data JPA, and Spring MVC. (3 pts)
- [x] Initialize your challenge using `start.spring.io` with the specified project options. (3 pts)
- [x] Connect to a MySQL database. (3 pts)
- [x] Your REST API accepts and returns data in JSON format where appropriate. (3 pts)
- [x] Your REST API is documented using Swagger, and the `.yaml` file is saved in the root of your project directory. (3 pts)

### Model (10 pts)

- [x] Customer model created using appropriate Spring annotations. (5 pts)
- [x] Customer model contains all necessary instance fields. (5 pts)

### Repository (25 pts)

- [x] Implements functionality to create a new customer record and includes tests. (5 pts)
- [x] Implements functionality to update an existing customer record and includes tests. (5 pts)
- [x] Implements functionality to delete an existing customer record and includes tests. (5 pts)
- [x] Implements functionality to find a customer record by id and includes tests. (5 pts)
- [x] Implements functionality to find customer records by state and includes tests. (5 pts)

### Controller (50 pts)

- [x] Implements a POST route that creates a new customer and includes tests using MockMVC and Insomnia. (10 pts)
- [x] Implements a PUT route that updates an existing customer and includes tests using MockMVC and Insomnia. (10 pts)
- [x] Implements a DELETE route that deletes an existing customer and includes tests using MockMVC and Insomnia. (10 pts)
- [x] Implements a GET route that returns a specific customer by id and includes tests using MockMVC and Insomnia. (10 pts)
- [x] Implements a GET route that returns all customers for a specific state and includes tests using MockMVC and Insomnia. (10 pts)

