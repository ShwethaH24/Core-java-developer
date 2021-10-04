class ProjectUtil{

public static void main(String a[]){

ProjectDTO dto=new ProjectDTO();
dto.setProjectDomain("Machine learning");
dto.setProjectName("Driver-Drowsiness Detection");
dto.setTeamates(4);
dto.setGuide("Prof:-Tej C Hiremath");
dto.setTechnologyUsed("OpenCV");
System.out.println(dto.getProjectDomain()+" "+dto.getProjectName()+" "+dto.getTeamates()+" "+dto.getGuide()+" "+dto.getTechnologyUsed());
}
}

