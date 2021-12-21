package com.xworkz.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AccountNoBeginer {
	public static void main(String[] arg) {
		Stream<Long> accountNoStream=Stream.of(123456789123L,99087689080L,799658062112L,901975902678L,974021764290L, 346789769999L,678945325678L,908765432190L,2311456789012L,123456789012L,906785342134L,789056432134L,214356789087L,4365789012112L,907856341234L);
	   
				List<Long> tempList=accountNoStream
				.filter((p)->p>500000000000L)
                .sorted()
                .collect(Collectors.toList());
                tempList.forEach((p)->System.out.println(p));
                
				
	
	
	}
}
