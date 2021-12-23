package com.xworkz.streamdto;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TempleUtil {
	public static void main(String[] args) {
		TempleDTO dto=new TempleDTO(1,"GaneshTemple","Bagalkot",5000);
		TempleDTO dto2=new TempleDTO(1,"Sai BabaTemple","mysore",9000);
		TempleDTO dto3=new TempleDTO(1,"LaxmiTemple","Banglore",4000);
		TempleDTO dto4=new TempleDTO(1,"GaneshTemple","Bagalkot",1000);
		
		Stream<TempleDTO> temple=Stream.of(dto,dto2,dto3,dto4);
		temple.filter((visit)->visit.getVisitorsPerday()>1000).sorted((e1,e2)->e2.getVisitorsPerday().compareTo(e1.getVisitorsPerday())).collect(Collectors.toList()).forEach((f)->System.out.println(f));
	
	
		
	}

}
