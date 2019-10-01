package com.example.morrisons.order;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.morrisons.exceptions.OrderNotFoundException;
import com.example.morrisons.order.Order;
import com.example.morrisons.order.OrderService;

// the methods required to add, delete and 
@RestController
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping("/order")
	public List<Order> getAllOrders() {
		return orderService.getAllOrders();
	}
	
	@RequestMapping("/order/{id}")
	public Order getOrder(@PathVariable String id) {
		
		return orderService.getOrderByID(id).orElseThrow(() -> new OrderNotFoundException(id));
	}
	
	@PostMapping("/order")
	public ResponseEntity<Order> addOrder(@Valid @RequestBody Order order) {
		orderService.addOrder(order);
		return new ResponseEntity<Order>(order, HttpStatus.OK);
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE, value= "/order/{id}")
	public void deleteOrder(@PathVariable String id ) {
		orderService.deleteOrder(id);
	}

}
