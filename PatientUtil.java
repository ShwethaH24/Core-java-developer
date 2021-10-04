class PatientUtil{

public static void main(String a[]){

PatientDTO dto=new PatientDTO();
dto.setPatientId(1234);
dto.setPatientName("Shwetha");
dto.setAge(24);
dto.setGender("female");
dto.setAddress("Bagalkot");
dto.setBloodGroup("O+");
System.out.println(dto.getPatientId()+" "+dto.getPatientName()+" "+dto.getAge()+" "+dto.getGender()+" "+dto.getAddress()+" "+dto.getBloodGroup());
}
}

