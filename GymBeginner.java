package com.xworkz.gymcentre;

import com.xworkz.gym.register.GymDAO;

public class GymBeginner {
	public static void main(String[] arg) {
		String gymName="Bagalkot";
	gymName=gymName.replace(" ","" );
	System.out.println(gymName);
	
	
	GymDAO dao=new GymDAO();
	dao.save("Bijapur ");
	dao.save("Bagalkot");
	dao.save("Mudhol");
	
	
	boolean found=dao.find("Bagalkot");
	
	System.out.println(found);
	found=dao.findByCaseInSensitive("Bagalkot");
	System.out.println(found);
	
	found =dao.findByCaseInSensitiveAndTrimmed("Bagalkot");
	System.out.println(found);
}

}



