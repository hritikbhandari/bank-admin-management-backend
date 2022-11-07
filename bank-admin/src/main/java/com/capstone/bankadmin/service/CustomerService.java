package com.capstone.bankadmin.service;
import java.util.List;


public interface CustomerService {
       public List<Customer>getAllData();
       public void deleteCustomer(int id);
}
