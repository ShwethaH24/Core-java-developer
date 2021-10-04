class Transportation{

    String transportationName ; 
    int transportationId;
   String location ; 
   String ownerName ; 
   boolean  isOpen ; 
   String items[]  = {"ship","airplane","train","bus", "railways"};  

   public Transportation(){
this("Navanagar" , "near KLE Ground", 2,"Ranganath", true);
  
System.out.println("Transportation object is created");
   
   }

   public Transportation(String TransportationName,String location, int TransportationId, String ownerName, boolean isOpen ){
        this.transportationName = transportationName ; 
        this.location = location ; 
        this.items = items;
        this.transportationId=  transportationId ; 
       this.ownerName = ownerName ;   
       this.isOpen = isOpen ; 
}




public void displayTransportation(){
   System.out.println(this.transportationName+" "+this.transportationId+ " "+this.ownerName+ " "+this.location+ " "+this.isOpen);
}
    
  public void getItems(){
for(int i=0; i < this.items.length; i++){
  System.out.println(this.items[i]);
     }
  }
}