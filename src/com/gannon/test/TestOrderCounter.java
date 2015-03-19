package com.gannon.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.gannon.util.OrderCounter;



public class TestOrderCounter   {

	@Test
	public void TestConstructor(){
		OrderCounter orderCounter = new OrderCounter(4);
		assertEquals(4, orderCounter.getOrders());
	}
}
