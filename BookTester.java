class BookTester{


public static void main(String a[]){

  Book book  = new Book ();
  book .setBookId(345);
  book.setBookName("Computer Graphics and Visualization");
  book.setShop("near Devannahalli") ; 

  Page page = new Page();
  page.pageId = 12;
  page.name = "PAGE-1";

  book .setPages(page);

  System.out.println(book);

}


} 