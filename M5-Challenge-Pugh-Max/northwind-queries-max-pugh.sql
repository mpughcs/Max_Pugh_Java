use northwind;
-- return the categories of products in the database
SELECT DISTINCT category 
FROM products;

-- Select products made by dell from the products table
SELECT *
FROM products p
WHERE p.product_name  LIKE '%dell%';

-- List all orders with with 'Pennsylvania' as their ship_state
SELECT *
FROM orders o 
WHERE o.ship_state = 'pennsylvania';


-- select first name and last name of all epmployees who's last name begins with 'W'
SELECT first_name, last_name
from employees e 
WHERE last_name LIKE 'w%';

-- list all customers who's zip codes begin in '55'
SELECT * 
FROM customers c 
WHERE c.postal_code LIKE "55%";

-- list all customers who's zip codes end in '0'
SELECT *
FROM customers c
WHERE c.postal_code LIKE '%0';

-- select first last name and email from customers with '.org' email address
SELECT first_name, last_name, email
FROM customers c 
WHERE email LIKE '%.org';

-- list first name, last, name and phone number of customers who have 202 area code
SELECT first_name, last_name, phone 
FROM customers c 
WHERE phone LIKE "%(202)%";

-- list the first name, last name, and phone number for all customers with area code 202 ordered
-- last name to first name

SELECT first_name, last_name, phone 
FROM customers c 
WHERE phone LIKE "%(202)%"
ORDER BY last_name, first_name ;
