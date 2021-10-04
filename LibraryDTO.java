public class LibraryDTO{

public LibraryDTO(){
System.out.println("Library DTO object is created");
}

private long libraryId;
private String libraryName;
private String book;
private String address;

public long getLibraryId(){
return libraryId;
}

public void setLibraryId(long libraryId){
this.libraryId=libraryId;
}

public String getLibraryName(){
return libraryName;
}

public void setLibraryName(String libraryName){
this.libraryName=libraryName;
}

public String getBook(){
return book;
}
public void setBook(String book){
this.book=book;
}
public String getAddress(){
return address;
}

public void setAddress(String address){
this.address=address;
}
}





