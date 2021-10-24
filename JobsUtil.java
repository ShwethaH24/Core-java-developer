class JobsUtil{

public static void main(String a[]){

JobsDTO dto = new JobsDTO();
dto.setName("Associate Software Trainee");
dto.setSalary(500000);
dto.setLocation("Bangalore");
System.out.println(dto);


JobsDTO dto1 = new JobsDTO();
dto1.setName("Front-end and Backend Developer");
dto1.setSalary(250000);
dto1.setLocation("Mysore");
System.out.println(dto1);

JobsDTO dto2 = new JobsDTO();
dto2.setName("java Developer");
dto2.setSalary(30000);
dto2.setLocation("Pune");
System.out.println(dto2);
}
}

