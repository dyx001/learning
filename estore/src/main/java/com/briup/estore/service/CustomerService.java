package com.briup.estore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.briup.estore.bean.Customer;
import com.briup.estore.dao.CustomerDao;
import com.briup.estore.exception.ServiceException;

@Transactional
@Service
public class CustomerService {
	@Autowired
	private CustomerDao customerDao;

	/**
	 * 注册，判断用户是否存在
	 * @param customer
	 * @throws Exception
	 */
	public void register(Customer customer) throws Exception {
		Customer customer2 = customerDao.findByName(customer.getName());
		if (customer2!=null) {
			throw new ServiceException("用户已经存在");
			
		}
		customerDao.save(customer);
	}
	
	//登录
	public Customer login(String name, String password) throws ServiceException {
		Customer customer = null;
		customer  = customerDao.findByName(name);
		return customer;
	}

	public void updateCustomer(Customer customer) throws ServiceException {

	}
}
