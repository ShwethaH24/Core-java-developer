package com.xworkz.equals;

import java.io.Serializable;

public class ProductDTO implements Serializable {
	private Integer id;
	private String name;
	private String type;
	private Integer price;
	private Integer quantity;
	public ProductDTO(Integer id, String name, String type, Integer price, Integer quantity) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.price = price;
		this.quantity = quantity;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public int hashCode() {
		return this.getId();
		
	}
	public boolean equals(Object obj, ProductDTO tempDto) {
		if(obj!=null) {
			if(obj instanceof ProductDTO) {
				
				if(this.getId().equals(tempDto.getId())) {
					return true;
				}
			}
		}
		return false;
	}
	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", name=" + name + ", type=" + type + ", price=" + price + ", quantity="
				+ quantity + "]";
	}
	
					
				}
			
