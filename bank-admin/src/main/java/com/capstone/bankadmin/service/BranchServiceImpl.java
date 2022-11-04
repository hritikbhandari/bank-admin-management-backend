package com.capstone.bankadmin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.bankadmin.model.Branch;
import com.capstone.bankadmin.repository.BranchRepository;

@Service
public class BranchServiceImpl implements BranchService {
	
	@Autowired
	private BranchRepository repo;

	@Override
	public boolean createBranch(Branch branch) {
		if(branch != null && (branch.getBranchName() == null || branch.getBranchCity() == null))
			return false;
		if(branch.getBranchName() == "" || branch.getBranchCity() == "")
			return false;
		Branch savedBranch = repo.save(branch);
		if(savedBranch != null)
			return true;
		else
			return false;
	}

}
