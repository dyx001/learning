package com.briup.estore.service;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.estore.bean.Book;
import com.briup.estore.dao.BookDao;
import com.briup.estore.exception.ServiceException;

import net.bytebuddy.asm.Advice.Return;

@Service
public class BookService {
	
	@Autowired
	private BookDao bookDao;
	public List<Book> findAllBooks() throws ServiceException {
		List<Book> list = bookDao.findAll();
		return list;
	}
	
	public Optional<Book> findById(Long id) {
		
		return bookDao.findById(id);
		
	}
	
}
