package com.xworkz.streamdto;

import java.util.stream.Stream;

public class HeadPhone {
	HeadPhoneDTO dto=new HeadPhoneDTO(1,"boat","wired","235v2",678);
	HeadPhoneDTO dto1=new HeadPhoneDTO(1,"apple","wired","235v2",658);
	HeadPhoneDTO dto2=new HeadPhoneDTO(1,"oneplus","wired","235v2",438);
	
	Stream<HeadPhoneDTO>headPhone=Stream.of(dto,dto1,dto2);
	headPhone.filter((a)->a.getType().equals("wired")).sorted((e1,e2)->e1.getId().compareTo(e2.getId())).collect(Collectors.toList()).forEach(s)->System.out.println(s));
	
}


