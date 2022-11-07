package com.capstone.bankadmin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.bankadmin.exception.NotFoundException;
import com.capstone.bankadmin.model.Account;
import com.capstone.bankadmin.repository.AccountRepository;


@Service
public class AccountServiceImpl implements AccountService{
	
	@Autowired
	private AccountRepository repo;

	@Override
	public boolean createAccount(Account account) throws IllegalArgumentException {
		if(account != null && (account.getAccountNumber() == 0 || account.getAccountStatus() == null || account.getAccountType() == null || account.getBranchId() == null))
			throw new IllegalArgumentException("Account details should not be Null");
		if(account.getAccountStatus() == "" || account.getAccountType() == "" || account.getBranchId() == "")
			throw new IllegalArgumentException("Account details should not be Empty");
		Account savedAccount= repo.save(account);
		if(savedAccount != null)
			return true;
		else
			return false;
	}

	@Override
	public List<Account> getAllAccountDetails() {
		return repo.findAll();
	}

	@Override
	public String deleteAccount(int accountId) throws NotFoundException {
		Account acc = repo.findById(accountId).orElseThrow(() -> new NotFoundException("Account with Id: "+ accountId + " not found!"));
		repo.deleteById(acc.getAccountNumber());
		return "Branch with Id: " + accountId + " deleted!";
	}

}
