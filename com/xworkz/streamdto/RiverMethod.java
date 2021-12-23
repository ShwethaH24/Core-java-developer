package com.xworkz.streamdto;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RiverMethod {
	public static void main(String[] args) {
		RiverDTO dto=new RiverDTO(1,"Ganga",2510.0,947);
		RiverDTO dto1=new RiverDTO(2,"Kaveri",2810.0,451);
		RiverDTO dto2=new RiverDTO(3,"Krishna",2590.0,561);
		RiverDTO dto3=new RiverDTO(4,"Mahanadi",9510.0,941);
		
		Stream<RiverDTO>river=Stream.of(dto,dto1,dto2,dto3);
		river.filter((len)->len.getLength()>500).sorted((e1,e2)->e1.getNoOfDams().compareTo(e2.getNoOfDams())).collect(Collectors.toList()).forEach((p)->System.out.println(p));
		
		
	}

}
