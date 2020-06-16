package com.briup.estore.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.briup.estore.bean.Order;

public interface OrderDao extends JpaRepository<Order, Long>{
	
	List<Order> findByCustomerId(long id);
	
}
