package com.zj.bookstore.order.domain;

import java.util.Date;
import java.util.List;

import com.zj.bookstore.user.domain.User;

/**
 * 订单类
 * @author GoHome
 *
 */
public class Order {
	private String oid; // 订单编号
	private Date ordertime; // 下单时间
	private double total; // 合计
	private int state; // 订单状态有四种：1：未付款   2：已付款但未发货  3：已发货但未确认收货  4：已确认交易成功
	private User owner; // 订单所有者
	private String address; // 收货地址
	
	private List<OrderItem> orderItemList; // 当前订单下所有条目（双向关联）
	
	public List<OrderItem> getOrderItemList() {
		return orderItemList;
	}
	public void setOrderItemList(List<OrderItem> orderItemList) {
		this.orderItemList = orderItemList;
	}
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	public Date getOrdertime() {
		return ordertime;
	}
	public void setOrdertime(Date ordertime) {
		this.ordertime = ordertime;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public User getOwner() {
		return owner;
	}
	public void setOwner(User owner) {
		this.owner = owner;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
