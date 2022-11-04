package com.capstone.bankadmin.repository;

import org.springframework.stereotype.Repository;

import com.capstone.bankadmin.model.Admin;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{

	public Admin findByUserId(String userId);
}
