package com.xworkz.equals;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class ProductInvoke {
	public static void main(String[] args) {
		ProductDTO dto1=new ProductDTO(1,"hp","laptop",  200000, 1);
		ProductDTO dto2=new ProductDTO(2,"redme","phone",2000,10);
		ProductDTO dto3=new ProductDTO(3,"laptop","electronics",20000,5);
		
		Set<ProductDTO>dtos =new LinkedHashSet<ProductDTO>();

		dtos.add(dto2);
		dtos.add(dto1);
		dtos.add(dto3);
		
		boolean b= dtos.equals(dto1);
		System.out.println(b);
		
		Optional<ProductDTO> optional =dtos.stream().filter((d)->d.getPrice()>10000.0).findFirst();
		System.out.println(dtos.size());
		System.out.println(optional);
	}
	
		
		
	}