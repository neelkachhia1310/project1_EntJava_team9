package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OrderUIController {
	@Autowired
	private OrderService orderService;

	@GetMapping("/order/form")
	public String showOrderForm(Model model) {
		model.addAttribute("order", new Order());
		return "order";
	}

	@PostMapping("/order/place")
	public String placeOrder(@ModelAttribute Order order, Model model) {
		Order savedOrder = orderService.placeOrder(order);
		model.addAttribute("message", "Order placed successfully with ID: " + savedOrder.getId());
		return "order_success";
	}
}
