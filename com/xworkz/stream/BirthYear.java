package com.xworkz.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BirthYear {
public static void main(String[] args) {
	Stream<Integer> birthYearStream=Stream.of(1964,1970,1997,1999,2000,2004,2020,2021,1996,1995,1990,1991,1994,1993,1891,1956,1789,1678,1879,1567);
	List<Integer> tempList=birthYearStream
			.filter((p)->p>1991)
			.sorted()
			.collect(Collectors.toList());
	tempList.forEach((p)->System.out.println(p));
}
}
