package com.xworkz.streamdto;

public class ZooDTO {
	private Integer id;
	private String name;
	private String state;
	private Double ticketPrice;
	
	public ZooDTO() {
		super();
		
	}
public ZooDTO(Integer id, String name, String state, Double ticketPrice) {
	super();
	this.id=id;
	this.name=name;
	this.state=state;
	this.ticketPeice=ticketPrice;
	

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
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public Double getTicketPrice() {
	return ticketPrice;
}
public void setTicketPrice(Double ticketPrice) {
	this.ticketPrice = ticketPrice;
}
@Override
public String toString() {
	return "ZooDTO [id=" + id + ", name=" + name + ", state=" + state + ", ticketPrice=" + ticketPrice+"]";
}

}
