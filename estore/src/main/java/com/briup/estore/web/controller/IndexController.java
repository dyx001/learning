package com.briup.estore.web.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.briup.estore.bean.Book;
import com.briup.estore.bean.Cart;
import com.briup.estore.bean.Customer;
import com.briup.estore.dao.CustomerDao;
import com.briup.estore.exception.ServiceException;
import com.briup.estore.service.BookService;
import com.briup.estore.service.CustomerService;

@Controller
public class IndexController {

	@Autowired
	private CustomerService customerService;

	@Autowired
	private BookService bookService;

	// 显示首页
	@GetMapping("/index")
	public String indexPage(HttpSession session, Model model) {

		return "index";
	}

	// 显示注册页面
	@GetMapping("/register")
	public String registerPage() {
		return "register";
	}
	//接受注册信息并返回登录界面
	@PostMapping("/register")
	public String register(Customer customer) {
		try {
			customerService.register(customer);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "register";
		}
		return "login";
	}

	// 显示登录页面
	@GetMapping({ "/", "/login" })
	public String loginPage(HttpSession session) {

		return "login";
	}

	/**
	 * 登录，判断用户登录密码是否正确
	 * 创建Book数据放入Session页面显示
	 * 创建空的购物车对象？？？？
	 */
	@PostMapping("/login")
	public String login(String name, String password, Model model, HttpSession session) throws ServiceException {
		Customer customer = customerService.login(name, password);
		List<Book> list = bookService.findAllBooks();
		Cart cart = new Cart();//创建一个空的购物车对象，放入Session
		if (customer != null && password.equals(customer.getPassword())) {
			session.setAttribute("cart", cart);
			session.setAttribute("books", list);
			session.setAttribute("customer", customer);
			return "redirect:index";
		}

		model.addAttribute("msg", "用户名或密码错误,请重新登录");
		return "forward:login";

	}
}
