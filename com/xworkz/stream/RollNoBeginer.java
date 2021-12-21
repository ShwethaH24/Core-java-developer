package com.xworkz.stream;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RollNoBeginer
{
     public static void main(String[] args) {
    	 Stream<Integer> rollNoStream=Stream.of(1,23,45,56,67,78,90,12,45,67,89,90,78,56,45,34,12,56,89,78);
    	 List<Integer> tempList=rollNoStream
    			 .filter((p)->p>50)
    			 .sorted(Collections.reverseOrder())
    			 .collect(Collectors.toList());
    	 tempList.forEach((p)->System.out.println(p));
     }
}


