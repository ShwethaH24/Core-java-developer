package com.xworkz.clone.cantens;

public class HospitalTester {
	public static void main(String[] args) throws CloneNotSupportedException {
System.out.println("main method started");
		Hospitals hos= new Hospitals();
		hos.setName("Kerudi covid hospital");
		hos.setCapacity(100);
		hos.setPlace("Bagalkot");
		hos.setType("covid hospital");

		Object obj=hos.clone();
		Hospitals hos1=(Hospitals)obj;
		System.out.println(hos1.toString());
		System.out.println("Main method ended");
	}

}


