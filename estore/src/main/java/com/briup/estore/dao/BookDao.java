package com.briup.estore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
//改过
import com.briup.estore.bean.Book;

public interface BookDao extends JpaRepository<Book, Long> {
	public Book findById(int id);
}
