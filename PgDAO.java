package com.xworkz.pgaddress.register;

import java.util.ArrayList;
import java.util.Collection;

public class PgDAO {
private Collection<String> regNoCollection=new ArrayList<String>();
	
	public  boolean save(String regNo) {
		return regNoCollection.add(regNo);
	}

public boolean find(String no) {
	return regNoCollection.contains(no);
}
public boolean findByCaseInSensitive(String no) {
	return false;
}
public boolean findByCaseInSensitiveAndTrimmed(String no) {
	return false;
}


}



