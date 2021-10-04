class Exam4{
public static String universityName="VTU";
public static int fees=1350;

public static void allow(String[] hallTicket){
System.out.println("start of allow method");
if(hallTicket!=null){
getHallTicketDetails(hallTicket);
}
else{
System.out.println("No HallTicket found");
}
System.out.println("end of allow method with HallTicket");
}

public static void allow(int fees){
System.out.println("start of allow method with fees");
if(fees>1000){
System.out.println(fees);
}
else{
System.out.println("gubbe..please pay the fees");
}
System.out.println("end of allow method with fees");
}
public static void getHallTicketDetails(String[] hallTicket){       
public static String universityName="VTU";
public static int fees=1350;

public static void allow(String[] hallTicket){
System.out.println("start of allow method");
if(hallTicket!=null){
getHallTicketDetails(hallTicket);
}
else{
System.out.println("No HallTicket found");
}
System.out.println("end of allow method with HallTicket");
}

public static void allow(int fees){
System.out.println("start of allow method with fees");
if(fees>1000){
System.out.println(fees);
}
else{
System.out.println("gubbe..please pay the fees");
}
System.out.println("end of allow method with fees");
}
public static void getHallTicketDetails(String[] hallTicket){
for(int i=0;i<hallTicket.length;i++){
System.out.println(hallTicket[i]);
}
}
}


for(int i=0;i<hallTicket.length;i++){
System.out.println(hallTicket[i]);
}
}
}

