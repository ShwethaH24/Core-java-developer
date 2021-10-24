class ProjectUtil{

public static void main(String a[]){
System.out.println("Main method started");

ProjectDTO dto=new ProjectDTO();
dto.setProjectDomain("Machine learning");
dto.setProjectName("Driver-Drowsiness Detection");
dto.setTeamates(4);
dto.setGuide("Prof:-Tej C Hiremath");
dto.setTechnologyUsed("OpenCV");
dto.setSelectedFor("VTU financial assistance");

dto.getDetailsofProject();
System.out.println(dto.hashCode());
System.out.println("main method ended");
System.out.println("Default value of hashCode"+dto.hashCode());

ProjectDTO dto1=new ProjectDTO();
dto1.setProjectDomain("Web-Technology");
dto1.setProjectName("Online Library Management System");
dto1.setTeamates(2);
dto1.setGuide("prof:- Veena V");

System.out.println(dto1.hashCode());
System.out.println("Default value of hashCode"+dto1.hashCode());


}
}

