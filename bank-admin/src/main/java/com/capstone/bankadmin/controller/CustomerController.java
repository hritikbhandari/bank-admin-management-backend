package com.capstone.bankadmin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.bankadmin.model.Customer;
import com.capstone.bankadmin.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService service;
	@GetMapping("/")
	public List<Customer> showAllData(){
		return service.getAllData();
	}

	@DeleteMapping("/delete/{id}")
	public String deletePost(@PathVariable("id")int id){
		service.deleteCustomer(id);
		
		return "data deleted successfully..";
	}
}
