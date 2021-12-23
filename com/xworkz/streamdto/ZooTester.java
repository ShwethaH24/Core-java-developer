package com.xworkz.streamdto;

import java.util.stream.Stream;

public class ZooTester {
	public static void main(String[] args) {
		
		
		ZooDTO dto1=new ZooDTO(1,"mysore Zoo","Karnataka",800);
		ZooDTO dto2=new ZooDTO(2,"National Zoological Park","Maharastra",900);
		
		Stream<ZooDTO>zoo=Stream.of(dto1,dto2);
		.sorted((a,m)->m.getTicketPrice().compareTo(a.getTicketPrice())))
         .collect(Collectors.toList())
         .forEach((s)->System.out.println(s));
         
		
	}

}
