package com.capstone.bankadmin.service;
import java.util.List;

import com.capstone.bankadmin.model.Customer;


public interface CustomerService {
       public List<Customer>getAllData();
       public void deleteCustomer(int id);
}
