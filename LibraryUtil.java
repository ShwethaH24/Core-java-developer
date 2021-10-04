class LibraryUtil{

public static void main(String a[]){

LibraryDTO dto=new LibraryDTO();
dto.setLibraryId(1234);
dto.setLibraryName("Ranna Grantalaya");
dto.setBook("padmaraddy");
dto.setAddress("Bagalkot");
System.out.println(dto.getLibraryId()+" "+dto.getLibraryName()+" "+dto.getBook()+" "+dto.getAddress());
}
}
