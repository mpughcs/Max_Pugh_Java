
# Bookstore REST API - README
In this project, Frankie Ortiz and I worked together build a REST API to manage inventory for a bookstore. We provided support for querying with GraphQL, and 
recorded a short video demo showing off the project which can be found below. 
# [Link to Video Demo!!](https://youtu.be/m_0QMZ2F4DE)

## General Setup and Format

- Your project must be created in an IntelliJ project called `Summative-2-Lastname-Firstname`.
- Initialize the project using `start.spring.io` with the following options:
    - Project: Maven
    - Language: Java
    - Spring Boot: Latest version of 2.x.x
    - Project Metadata:
        - Group: com.company
        - Artifact: bookstore (This will automatically update the values for Name and Package Name)
    - Packaging: Jar
    - Java: 11
    - Dependencies: Spring Web, Spring Data JPA, and Spring for GraphQL.
- Your project must have a series of tests using MockMvc.
- Your project must use the existing `book_store` database.
- Your REST API must accept and return data in JSON format where appropriate.
- Your REST API must be documented using Swagger. Save the `.yaml` file in the root of the project directory.

---

## Bookstore REST API

The Bookstore web service manages inventory for a bookstore. The REST APIs in this project allow callers to perform the following actions:

- [x] Create, Read, Update, and Delete Books.
- [x] Create, Read, Update, and Delete Authors.
- [x] Create, Read, Update, and Delete Publishers.
- [x] Find Books by a given Author.

### User Stories

- [x] As an API user, I would like to create, read, update, and delete authors.
- [x] As an API user, I would like to create, read, update, and delete publishers.
- [x] As an API user, I would like to create, read, update, and delete books.
- [x] As an API user, I would like to find all books by a given author.

### Requirements for Book API

- **Book API** :
    - [x] Code is clean and follows general patterns as presented in class.
    - [x] Implementation of Book model.
    - [x] Implementation of Book repository and controller for the following actions:
        - [x] Create
        - [x] Read by Id
        - [x] Read All
        - [x] Update
        - [x] Delete
        - [x] Search Book by Author Id
    - [x] Test of Book repository and MockMvc test cases for the following actions:
        - [x] Create
        - [x] Read by Id
        - [x] Read All
        - [x] Update
        - [x] Delete
        - [x] Search Book by Author Id

### Requirements for Author API

- **Author API** :
    - [x] Code is clean and follows general patterns as presented in class
    - [x] Implementation of Author model
    - [x] Implementation of Author repository and controller for the following actions:
        - [x] Create
        - [x] Read by Id
        - [x] Read All
        - [x] Update
        - [x] Delete
    - [x] Test of Author repository and MockMvc test cases for the following actions:
        - [x] Create
        - [x] Read by Id
        - [x] Read All
        - [x] Update
        - [x] Delete

### Requirements for Publisher API

- **Publisher API** :
    - [x] Code is clean and follows general patterns as presented in class
    - [x] Implementation of Publisher model
    - [x] Implementation of Publisher repository and controller for the following actions:
        - [x] Create
        - [x] Read by Id
        - [x] Read All
        - [x] Update
        - [x] Delete
    - [x] Test of Publisher repository and MockMvc test cases for the following actions:
        - [x] Create
        - [x] Read by Id
        - [x] Read All
        - [x] Update
        - [x] Delete

---

## Bookstore GraphQL

Your project must support GraphQL queries to retrieve the following information:

- [x] Get a publisher by id.
    - Including books for the publisher and authors for the books.
- [x] Get an author by id.
    - Including books by the author.
- [x] Get a book by id.
    - Including the author and publisher of the book.

### Requirements for GraphQL :

- **GraphQL** (15%):
    - [x] Implementation of:
        - [x] Find Publisher by Id (Including books for the publisher and authors for the books).
        - [x] Find Author by Id (Including books by the author).
        - [x] Find Book by Id (Including the author and publisher of the book).

---

## Video Summary

Create a 1 to 3-minute video summary of your project that meets the following requirements:

- [x] Video should be created in MP4 format.
- [x] Video should include screen-capture recordings to highlight the sections of the project that are important in meeting the project requirements.

---

