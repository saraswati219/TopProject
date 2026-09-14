package com.app.streamCustomObject1;

import java.util.List;

public class Product {
	private int id;
	private String name;
	private String category;
	private String brand;
	private double price;
	private int quantity;
	private double rating;
	private String city;
	List<String> tags;
	public Product(int id, String name, String category, String brand, double price, int quantity, double rating,
			String city, List<String> tags) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
		this.rating = rating;
		this.city = city;
		this.tags = tags;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getCategory() {
		return category;
	}
	public String getBrand() {
		return brand;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	public double getRating() {
		return rating;
	}
	public String getCity() {
		return city;
	}
	public List<String> getTags() {
		return tags;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", brand=" + brand + ", price="
				+ price + ", quantity=" + quantity + ", rating=" + rating + ", city=" + city + ", tags=" + tags + "]";
	}
	
	
	

}
