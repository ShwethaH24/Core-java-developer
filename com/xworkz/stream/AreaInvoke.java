package com.xworkz.stream;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AreaInvoke {
	public static void main(String[] args) {
		Stream<String> areaStream=Stream.of("RajajiNagar","Vidya Nagar","Meti nagar","BTM layout","Vijaya nagar","Gayatri nagar","jayanagar","sadashivnagar","Indira nagar","basavangudi");
		List<String> tempList=areaStream
				.map(String::toLowerCase)
				.sorted()
				.collect(Collectors.toList());
		tempList.forEach((p)->System.out.println(p));
		
		//System.out.println("****************************************************************");//
		System.out.println("Areas in descending order");
		Stream<String> areaStream1=Stream.of("RajajiNagar","Vidya Nagar","Meti nagar","BTM layout","Vijaya nagar","Gayatri nagar","jayanagar","sadashivnagar","Indira nagar","basavangudi");
		List<String> tempList1=areaStream1
				.map(String::toUpperCase)
				.sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		tempList1.forEach((p)->System.out.println(p));
		
	}

}
