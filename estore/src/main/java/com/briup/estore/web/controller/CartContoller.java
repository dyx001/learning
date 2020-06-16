package com.briup.estore.web.controller;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.briup.estore.bean.Book;
import com.briup.estore.bean.Cart;
import com.briup.estore.bean.Line;
import com.briup.estore.exception.ServiceException;
import com.briup.estore.service.BookService;

@Controller
@RequestMapping("/cart")
public class CartContoller {

	@Autowired
	private BookService bookService;

	/**
	 * 添加订单明细line，有错
	 */
//	@RequestMapping("/add/${book.id }")
//	public String addBook(@PathVariable("book.id") Long id, HttpServletRequest request, HttpServletResponse response,
//			Model model) {
//		Optional<Book> book = bookService.findById(id);
//		Line line = new Line();
//		line.setId(id);
//		line.setNum(0);
//		Cart cart = (Cart) request.getAttribute("cart");
//		cart.add(line);
//		return "cart";
//	}

	// 显示购物车页面
	@GetMapping({ "/", "" })
	public String showCart() {
		return "user/cart";
	}

}
