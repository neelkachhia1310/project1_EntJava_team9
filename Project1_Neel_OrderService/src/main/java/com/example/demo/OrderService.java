package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	@Autowired
	private OrderRepository orderRepository;

	public Order placeOrder(Order order) {
		order.setStatus("Pending");
		return orderRepository.save(order);
	}
}
