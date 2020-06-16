package com.briup.estore.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.briup.estore.bean.Line;

public interface LineDao  extends JpaRepository<Line, Long>{

}
