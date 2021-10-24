class MobileTester{


public static void main(String a[]){

Mobile mobile  = new Mobile ();

mobile.setMobileName("VIVO-Y71");
mobile .setNumber(7996580621L) ; 

Sim sim = new Sim();
sim.simId = 90;
sim.name = "JIO";

mobile.setSims(sim );

System.out.println(mobile);

}


} prasad@turnia.in