

create database bank_admin;

create table customer_master(
customer_number VARCHAR(6),
firstname VARCHAR(30),
middlename VARCHAR(30),
lastname VARCHAR(30),
customer_city VARCHAR(15),
customer_contact_no varchar(10),
occupation varchar(20),
customer_date_of_birth date);

create table branch_master(
	branch_id VARCHAR(6) PRIMARY KEY,
	branch_name VARCHAR(30),
	branch_city VARCHAR(30)
);

create table account_master(
	account_number VARCHAR(6) PRIMARY KEY,
	customer_number VARCHAR(6),
	branch_id VARCHAR(6),
	opening_balance INT(7),
	account_opening_date DATE,
	account_type VARCHAR(10),
	account_status VARCHAR(10),
	FOREIGN KEY (customer_number) REFERENCES customer_master (customer_number),
	FOREIGN KEY (branch_id) REFERENCES branch_master(branch_id)
);
