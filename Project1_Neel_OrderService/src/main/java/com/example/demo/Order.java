package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "orders")
public class Order {
	@Id
	private String id;
	private String userId;
	private String stockSymbol;
	private int quantity;
	private String status;

	@Override
	public String toString() {
		return "Order [id=" + id + ", userId=" + userId + ", stockSymbol=" + stockSymbol + ", quantity=" + quantity
				+ ", status=" + status + "]";
	}

	public Order() {
		super();
	}

	public Order(String id, String userId, String stockSymbol, int quantity, String status) {
		super();
		this.id = id;
		this.userId = userId;
		this.stockSymbol = stockSymbol;
		this.quantity = quantity;
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getStockSymbol() {
		return stockSymbol;
	}

	public void setStockSymbol(String stockSymbol) {
		this.stockSymbol = stockSymbol;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
