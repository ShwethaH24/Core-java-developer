package com.xworkz.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AtmPin {
	public static void main(String[] args) {
		Stream<Integer> atmPinStream=Stream.of(1234,3456,5678,7890,1234,5643,4578,8907,4356,7896,4567,4444,3456,2345,4563,2354,8976,9087,9867,4567);
		List<Integer> tempList=atmPinStream
				.filter((p)->p>1500)
				.sorted()
				.collect(Collectors.toList());
		tempList.forEach((p)->System.out.println(p));
	}

}
