package com.xworkz.equals;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class HockyInvoke {
	public static void main(String[] args) {
		HockyDTO dto1 =new HockyDTO("redsticks",78,42,"netherland");
		HockyDTO dto2 =new HockyDTO("baratharmy",76,23,"india");
		HockyDTO dto3 =new HockyDTO("oranje",78,42,"netherland");
		
		Set<HockyDTO> dtos=new LinkedHashSet<HockyDTO>();
		dtos.add(dto3);
		dtos.add(dto2);
		dtos.add(dto1);
		
		boolean b= dto2.equals(dto1);
		System.out.println(b);
		
		Optional<HockyDTO> optional =dtos.stream().filter((e)->e.getWins()>30).sorted((e1,e2)->e2.getTeamName().compareTo(e1.getTeamName())).findFirst();
		System.out.println(dtos.size());
		System.out.println(optional);
		
		
	}

}
