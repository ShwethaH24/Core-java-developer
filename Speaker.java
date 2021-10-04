class Speaker{
   static String name="Boat";
   static int minVolume=3;  
   static int maxVolume=0;
   static boolean isConnected=false;
   static int currentVolume;

 public static boolean onOrOff(){
 if(isConnected==true){
  isConnected=false;
  return isConnected;
}
else{
return isConnected;
}
}

public static void decreaseVolume(){
System.out.println("inside decreaseVolume()");
if(isConnected){
if(currentVolume>=maxVolume){
currentVolume=currentVolume+1;
System.out.println("the currentVolume is:"+currentVolume);
}
else{
System.out.println("MaxVolume reached.....");
}
}

System.out.println("end of increaseVolume()");
}
}


