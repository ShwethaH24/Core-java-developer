package com.xworkz.streamdto;

import java.util.stream.Stream;

public class CafeTester {
 public static void main(String[] args) {
	 CafeDto dto=new CafeDto("Blueberry","veg","Bagalkot",4.4f,111);
	 CafeDto dto1=new CafeDto("Blueberry","veg","Banglore",4.9f,789);
	 CafeDto dto2=new CafeDto("Blueberry","non-veg","Mysore",4.9f,456);
	 CafeDto dto3=new CafeDto("Blueberry","veg","Gadag",4.4f,111);
	 CafeDto dto4=new CafeDto("Blueberry","non-veg","Mudhol",5f,923);
	 
	 Stream<CafeDto>cafe=Stream.of(dto,dto1,dto2,dto3,dto4);
	 cafe.filter((e)->e.getratings()>3
			 .sorted((e1->getName().compareTo(e2.getName()))
					 .collect(Collectors.toList()
					 .forEach((t)->System.out.println(t));
 }
}
