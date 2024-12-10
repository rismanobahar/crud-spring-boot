package com.boostmytool.beststore.models;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.*;

public class ProductDto {
	@NotEmpty(message = "The name is required")
	private String name;
	
	@NotEmpty(message = "The brand is required")
	private String brand;
	
	@NotEmpty(message = "The name is required")
	private String category;
	
	@Min(0)
	private double price;
	
	@Size(min = 10, message = "the description should be at least 10 characters")
	@Size(max = 2000, message = "The description cannot exceed 2000 characters")
	private String description;
	private MultipartFile ImageFile;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public MultipartFile getImageFile() {
		return ImageFile;
	}
	public void setImageFile(MultipartFile imageFile) {
		ImageFile = imageFile;
	}
	
	
}
