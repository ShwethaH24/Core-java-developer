package com.xworkz.streamdto;

public class HeadPhoneDTO {
	private int id;
	private String brand;
	private String type;
	private String model;
	private double price;
	 
	
	public HeadPhoneDTO() {
		super();
	}
public HeadPhoneDTO(int id,String name,String type,String model,double price) {
	super();
	this.id=id;
	this.brand=brand;
	this.type=type;
	this.model=model;
	this.price=price;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "HeadPhoneDTO [id=" + id + ", brand=" + brand + ", type=" + type + ", model=" + model + ", price=" + price+"]";
}

}
