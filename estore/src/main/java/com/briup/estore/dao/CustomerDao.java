package com.briup.estore.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.briup.estore.bean.Customer;

public interface CustomerDao extends JpaRepository<Customer, Long> {
	
	Customer findByName(String name);
	
}
