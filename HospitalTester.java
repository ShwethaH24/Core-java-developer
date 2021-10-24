class HospitalTester{


public static void main(String a[]){

Hospital hospital = new Hospital();
hospital.setHospitalName("Kerudi");
hospital.setLocation("near Devannahalli") ; 

Patient patient = new Patient();
patient.patientId = 90;
patient.name = "Shwetha";

hospital.setPatients(patient );

System.out.println(hospital);

}


}