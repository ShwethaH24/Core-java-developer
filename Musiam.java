class Musiam{

    String musiamName ; 
 String location ; 
   String ownerName ; 
   boolean  isOpen ; 
   String items[]  = {"artist","cultural","historical","ceramics", "paintings"};  

   public Musiam(){
this("Bagalkot" , "near KLE Ground", "Anand", true);
  
System.out.println("Musiam object is created");
   
   }

   public Musiam(String musiamName,String location,String ownerName, boolean isOpen ){
        this.musiamName = musiamName ; 
        this.location = location ; 
        this.items = items;
        this.ownerName = ownerName ;   
        this.isOpen = isOpen ; 
}

public void displayMusiam(){
   System.out.println(this.musiamName+" "+this.ownerName+" "+this.location+" "+this.isOpen);
}

  public void getItems(){
   for(int i=0; i < this.items.length; i++){
   System.out.println(this.items[i]);
     }
  }
}