class Book{

public int bookId ; 
public String bookName ; 
public String shop;

public Page pages;

public Book (){
System.out.println(this.getClass().getSimpleName() +" Object is created ");
}


public void setBookId(int bookId){
this.bookId = bookId ; 
}

public void setBookName(String  bookName){
this. bookName = bookName ; 
}


public void setShop(String shop){
this.shop = shop ; 
}

public void setPages(Page pages){
this.pages = pages ; 
}

@Override
public String toString(){
return "Book - [bookId = "+  this.bookId+" , bookName = "+ this.bookName+" , shop = "+ this.shop+" , Page = "+this.pages+"]";
}
}
