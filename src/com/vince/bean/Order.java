package com.vince.bean;

import java.awt.List;
import java.io.Serializable;
import java.util.ArrayList;

import com.vince.utils.OrderStatusType;

public class Order implements Serializable{
	private int orderId;
	private ArrayList<OrderItem> orderItemList=new ArrayList<>();
	private String createDate;
	private float sum;//总金额
	private OrderStatusType status=OrderStatusType.UNPAID;//状态(枚举)
    private int userId;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public ArrayList<OrderItem> getOrderItemList() {
		return orderItemList;
	}
	public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
		this.orderItemList = orderItemList;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public float getSum() {
		return sum;
	}
	public void setSum(float sum) {
		this.sum = sum;
	}
	public OrderStatusType getStatus() {
		return status;
	}
	public void setStatus(OrderStatusType status) {
		this.status = status;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
}
