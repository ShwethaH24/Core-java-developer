package com.xworkz.equals;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class CompantTest {
	public static void main(String[] args) {
		CompanyDTO dto=new CompanyDTO(1,"tcs","Rajesh Gopinathan",2017886898778899.90);
		CompanyDTO dto1=new CompanyDTO(2,"capgemini","aiman ezzat",20178868956778899.20);	
		CompanyDTO dto2=new CompanyDTO(3,"accenture","julie sweet",2017886898778899.80);
		CompanyDTO dto3=new CompanyDTO(4,"infosys","Salil parekh",2017886898778899.80);
		CompanyDTO dto4=new CompanyDTO(5,"wipro","Thierry Delaporte",2017886898778899.80);
		CompanyDTO dto5=new CompanyDTO(6,"oracle","shailender kumar",2017886898778899.00);
		CompanyDTO dto6=new CompanyDTO(6,"oracle","shailender kumar",20178000008778899.70);
		
		Set<CompanyDTO> dtos=new LinkedHashSet<CompanyDTO>();
		dtos.add(dto5);
		dtos.add(dto3);
		dtos.add(dto1);
		dtos.add(dto4);
		dtos.add(dto);
		dtos.add(dto2);
		dtos.add(dto6);
		
		boolean b=dto5.equals(dto6);
		System.out.println(b);
		
		Optional<CompanyDTO> optional=dtos.stream().filter((t)->t.getTurnOver()>1400000000000000.00).findFirst();
		System.out.println(dtos.size());
		System.out.println(optional);
		
		
		
	}

}
