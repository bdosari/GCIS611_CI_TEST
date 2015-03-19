package com.gannon.util;

public class OrderCounter {
	int orders = 0;

	public OrderCounter(int orders) {
		super();
		this.orders = orders;
	}

	public int getOrders() {
		return orders;
	}

	public void setOrders(int orders) {
		this.orders = orders;
	}

}
