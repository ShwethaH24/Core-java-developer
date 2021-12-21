package com.xworkz.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PNRInvoke {
public static void main(String[] args) {
	
	Stream<Long> pnrStream=Stream.of(1234567891L,990876890L,7996580621L,9019759026L,9740217642L, 999990980L,6789453256L,9087654321L,2311456789L,1234567890L,9067853421L,7890564321L,214356789087L,4365789012112L,907856341234L,7865904532L,890765432L,1256879087L);
			   
			List<Long> tempList=pnrStream
			.filter((p)->p>50000000000L)
            .sorted()
            .collect(Collectors.toList());
            tempList.forEach((p)->System.out.println(p));
            
}
}
