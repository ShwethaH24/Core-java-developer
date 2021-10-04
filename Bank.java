class Bank{
public static String bankName="axis Bank";
public static int minAmount=1000;

public static void allow(String[] bankBalance){
System.out.println("checking Bank Balance");
if(minAmount>1000){
System.out.println("minAmount is Satisfied");
if(null!=bankBalance){
getbankDetails(bankBalance);
System.out.println("bank balance is more then minAmount");
}
else{
System.out.println("not having minAmount");
}
}
else{

System.out.println("please maintain min Balance of 1000");
}
System.out.println("checked bank balance");
}
public static void getbankDetails(String[] bankBalance){
for(int i=0;i<bankBalance.length;i++){
System.out.println(bankBalance[i]);
}
}
}







