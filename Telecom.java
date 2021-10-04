class TeleCom{
public static String TeleCommunicationCompanyName="Airtel";
public static int rechargeForUpTo=72;

public static void allow(String[] datapackAndTalktime){
System.out.println("Recharging Airtel SIM");
if(rechargeForUpTo<72){
System.out.println("Airtel pack is going to expire");
if(null!=datapackAndTalktime){
getrechargingDetails(datapackAndTalktime);
System.out.println("Airtel pack is valid");
}
else{
System.out.println("your Airtel pack is Expired");
}
}
else{

System.out.println("RENEW YOUR PACK!Recharge with any unlimited pack to continue services");
}
System.out.println("RECHARGE IS SUCCESSFUL");
}
public static void getrechargingDetails(String[] datapackAndTalktime){
for(int i=0;i<datapackAndTalktime.length;i++){
System.out.println(datapackAndTalktime[i]);
}
}
}
