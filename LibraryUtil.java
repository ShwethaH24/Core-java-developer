class LibraryUtil{

public static void main(String a[]){
System.out.println("main method started");

LibraryDTO dto=new LibraryDTO();
dto.setLibraryId(1234);
dto.setLibraryName("Ranna Grantalaya");
dto.setBook("padmaraddy");
dto.setAddress("Bagalkot");
dto.getDetailsofLibrary();

System.out.println(dto.hashCode());
System.out.println("main method is ended");
System.out.println("Default value of hashCode"+dto.hashCode());



LibraryDTO dto1=new LibraryDTO();
dto1.setLibraryId(12345);
dto1.setLibraryName("Ranna Grantalaya");
dto1.setBook("da Rao");
dto1.setAddress("Gadag");


System.out.println(dto1.hashCode());
System.out.println("main method is ended");
System.out.println("Default value of hashCode"+dto1.hashCode());

}
}
