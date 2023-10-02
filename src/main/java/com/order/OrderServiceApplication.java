package com.order;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/order-service")
public class OrderServiceApplication {

	@GetMapping("/listOrders")
	public List<Order> listOrders() {
		return getOrderList();
	}

	private List<Order> getOrderList() {
		return Stream.of(new Order(1, "Mumbai", 10000), 
				new Order(2, "New Mumbai", 15000),
				new Order(3, "Kamothe", 5000), 
				new Order(4, "Panvel", 20000))
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}

}
