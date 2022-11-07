package com.capstone.bankadmin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.bankadmin.repository.CustomerRepository;


@Service
public class CustomerServiceImpl implements CustomerService{
	
    @Autowired
    CustomerRepository repo;
	@Override
	public List<Customer>getAllData() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

}
