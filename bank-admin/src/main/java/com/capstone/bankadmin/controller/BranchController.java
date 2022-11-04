package com.capstone.bankadmin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.bankadmin.model.Branch;
import com.capstone.bankadmin.service.BranchService;

@RestController
@RequestMapping("/branch")
public class BranchController {

	@Autowired
	private BranchService branchService;
	
	@PostMapping("/")
	public ResponseEntity<Boolean> createBranch(@RequestBody Branch branch) {
		boolean created = branchService.createBranch(branch);
		if(created)
			return new ResponseEntity<>(true, HttpStatus.CREATED);
		else
			return new ResponseEntity<>(false, HttpStatus.CONFLICT);
	}
}
