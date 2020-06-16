package com.briup.estore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.briup.estore.bean.Order;
import com.briup.estore.dao.OrderDao;
import com.briup.estore.exception.ServiceException;


@Service
public class OrderService {
	@Autowired
	private OrderDao orderDao;
	
	@Transactional
	public void saveOrder(Order order) throws ServiceException{
		orderDao.save(order);
	}
	@Transactional
	public void deleteOrder(Long id) throws ServiceException{
		orderDao.deleteById(id);
	}
	@Transactional
	public void deleteOrder(Order order) throws ServiceException{
		orderDao.delete(order);
	}
	public Order findById(Long id) throws ServiceException{
		return orderDao.findById(id).orElse(null);
	}
	public List<Order> findByCustomerId(Long id) throws ServiceException{
		return orderDao.findByCustomerId(id);
	}
}
