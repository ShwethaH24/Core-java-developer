package com.xworkz.pgaddress;

import com.xworkz.gym.register.GymDAO;
import com.xworkz.pgaddress.register.PgDAO;

public class PgDetails {
	public static void main(String[] arg) {
		String pgName="Sharadha pg Bagalkot";
	pgName=pgName.replace(" ","" );
	System.out.println(pgName);
	
	
	PgDAO dao=new PgDAO();
	dao.save("Kushi PG Gayatrinagar ");
	dao.save("Spandana Pg");
	dao.save("Sharadha pg Bagalkot");
	
	
	boolean found=dao.find("Sharadha Pg Bagalkot");
	
	System.out.println(found);
	found=dao.findByCaseInSensitive("Sharadha Pg Bagalkot");
	System.out.println(found);
	
	found =dao.findByCaseInSensitiveAndTrimmed("Sharadha Pg Bagalkot");
	System.out.println(found);
}

}



