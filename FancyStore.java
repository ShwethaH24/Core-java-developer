class FancyStore{

 String storeName ; 
 String location ; 
 String ownerName ; 
 boolean  isOpen ; 
 String items[]  = {"Bangales","earings","nail polish","Lips sTicks", "ring"};  

public FancyStore(){
this("Bagalkot" , "near Sai Temple", "Deepa", true);
  
System.out.println("Fancystore object is created");
   
  }

   public FancyStore(String applianceName,String location,String ownerName, boolean isOpen ){
        this.storeName = storeName ; 
        this.location = location ; 
        this.items = items;
        this.ownerName = ownerName ;   
        this.isOpen = isOpen ; 
}

public void displayFancyStore(){
   System.out.println(this.storeName+" "+this.ownerName+" "+this.location+" "+this.isOpen);
}

  public void getItems(){
   for(int i=0; i < this.items.length; i++){
   System.out.println(this.items[i]);
     }
  }
}
