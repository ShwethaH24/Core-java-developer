class GasCylinder{
public String cylinderName;
public int amount;
public GasCylinder(String cylinderName,int amount){
System.out.println("Gas object is created");
this.cylinderName=cylinderName;
this.amount=amount;
System.out.println(this.cylinderName+" "+this.amount);
}
public static void main(String a[]){
GasCylinder gas=new GasCylinder("hp",1000);
GasCylinder gas1=new GasCylinder("indian",1100);
}
}
