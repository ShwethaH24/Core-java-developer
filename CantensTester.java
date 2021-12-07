package com.xworkz.clone.cantens;

public class CantensTester {
	public static void main(String[] args) throws CloneNotSupportedException {

		Cantens can=new Cantens();
		can.setName("Shanti Sagar center");
		can.setType("vegetarian");
		can.setNoOfDishes(5);
		can.setFamousDish("Nodels");

		Object obj=can1.clone();
		Cantens can1=(Cantens)obj;
		System.out.println(can1.toString());

	}
}
