class Appliance{

    String applianceName ; 
 String location ; 
   String ownerName ; 
   boolean  isOpen ; 
   String items[]  = {"Wahing-machine","microwave Ovens","refrigerators","water heaters", "kitchen stoves"};  

   public Appliance(){
this("Bagalkot" , "near KLE Ground", "Anand", true);
  
System.out.println("Appliance object is created");
   
   }

   public Appliance(String applianceName,String location,String ownerName, boolean isOpen ){
        this.applianceName = applianceName ; 
        this.location = location ; 
        this.items = items;
        this.ownerName = ownerName ;   
        this.isOpen = isOpen ; 
}

public void displayAppliance(){
   System.out.println(this.applianceName+" "+this.ownerName+" "+this.location+" "+this.isOpen);
}

  public void getItems(){
   for(int i=0; i < this.items.length; i++){
   System.out.println(this.items[i]);
     }
  }
}