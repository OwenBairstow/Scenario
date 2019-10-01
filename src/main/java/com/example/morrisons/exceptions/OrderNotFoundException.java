package com.example.morrisons.exceptions;

// order not found exception
public class OrderNotFoundException extends RuntimeException{
	public OrderNotFoundException(String id) {
		super("Order ID not found: " + id);
	}
}
