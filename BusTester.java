class 	BusTester{


 public static void main(String a[]){

 Bus bus  = new Bus ();
 bus .setBusId(375);
 bus.setBusName("URL");
 bus .setLocation("Banglore") ; 

 Passenger passenger = new Passenger();
 passenger.passengername = "Shwetha";
 passenger.number= 7996580621L;

 bus .setPassengers(passenger);

 System.out.println(bus);

}
}