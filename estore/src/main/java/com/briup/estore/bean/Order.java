package com.briup.estore.bean;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 订单类
 */
@Entity
@Table(name = "t_order")
public class Order implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Double cost; // 价钱（总价）
	private Date orderDate; // 订单日期,注意，自动对应表中的列为order_date
	private String payway; // 付款方式

	// 订单项外键
	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Collection<Line> lines = new HashSet<>(); // 一对多

	@ManyToOne(fetch = FetchType.LAZY)
	// customer外键建立
	@JoinColumn(name = "customer_id")
	private Customer customer; // 多对一

	public Order() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Collection<Line> getLines() {
		return lines;
	}

	public void setLines(Collection<Line> lines) {
		this.lines = lines;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getPayway() {
		return payway;
	}

	public void setPayway(String payway) {
		this.payway = payway;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", cost=" + cost + ", orderDate=" + orderDate + ", payway=" + payway + ", lines="
				+ lines + ", customer=" + customer + "]";
	}

}
