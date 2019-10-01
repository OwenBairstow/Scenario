package com.example.morrisons.exceptions;

import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.ResponseStatus;

// order can't be created Exception
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class OrderCantBeCreatedExceptionHandler extends RuntimeException {
		public OrderCantBeCreatedExceptionHandler(String exception) {
			super(exception);
		}
}
