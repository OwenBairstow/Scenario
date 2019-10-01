package com.example.morrisons.order;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// set of methods that gets and adds orders to and from the database
@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;

	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		List <Order> orders = new ArrayList<>();
		orderRepository.findAll().forEach(orders::add);
		return orders;
	}

	public Optional<Order> getOrderByID(String id) {
		// TODO Auto-generated method stub
		return orderRepository.findById(id);
		
	}

	public void addOrder(Order order) {
		// TODO Auto-generated method stub
		
		orderRepository.save(order);
		
	}

	public void deleteOrder(String id) {
		// TODO Auto-generated method stub
		
		orderRepository.deleteById(id);
		
	}
	

}
