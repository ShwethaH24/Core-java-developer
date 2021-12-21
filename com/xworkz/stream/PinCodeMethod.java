package com.xworkz.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PinCodeMethod {
public static void main(String[] args) {
	
	Stream<Integer> pinCodeStream=Stream.of(580000,670000,3487699,5698071,906785,2134567,3456789,657897,8907654,789065,580027,580001,571123,567843,587960,587906,567890,567894,786590,805689);
			List<Integer> tempList=pinCodeStream
			.filter((p)->p>580000)
					.sorted()
					.collect(Collectors.toList());
			tempList.forEach((p)->System.out.println(p));
}
}
