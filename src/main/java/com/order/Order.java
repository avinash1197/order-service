package com.order;

public class Order {

	private int orderId;
	private String orderAddress;
	private int orderPrice;

	public Order() {
		super();
	}

	public Order(int orderId, String orderAddress, int orderPrice) {
		super();
		this.orderId = orderId;
		this.orderAddress = orderAddress;
		this.orderPrice = orderPrice;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderAddress() {
		return orderAddress;
	}

	public void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
	}

	public int getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(int orderPrice) {
		this.orderPrice = orderPrice;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderAddress=" + orderAddress + ", orderPrice=" + orderPrice + "]";
	}

}
