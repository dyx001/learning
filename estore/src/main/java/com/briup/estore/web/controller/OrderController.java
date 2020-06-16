package com.briup.estore.web.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.briup.estore.bean.Cart;
import com.briup.estore.bean.Customer;
import com.briup.estore.bean.Line;
import com.briup.estore.bean.Order;
import com.briup.estore.exception.ServiceException;
import com.briup.estore.service.OrderService;

@Controller
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	
	//显示确认订单页面
	@GetMapping("/confirm")
	public String orderConfirm() {
		
		return "user/confirmOrder";
	}
	
	
	
	//显示当前用户的所有订单
	@GetMapping({"","/"})
	public String orderShow(HttpSession sesstion,Model model) {
		
		
		
		return "user/order";
	}	
	
	
	
	
	
	
}
