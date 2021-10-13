class CorporationTester{

public static void main(String a[]){

Bank bank = new CorporationBank();// up-casting
CorporationBank corporationBank=(CorporationBank)bank;// down casting
bank.provideLoans(9.2); 
System.out.println(bank);

Bank bank1=new CorporationBank();
bank1.provideLoans(4.5);
System.out.println(bank1);

Bank bank2=new CorporationBank();
bank2.provideLoans(1.2);
System.out.println(bank2);

Bank bank3=new CorporationBank();
bank3.provideLoans(5.5);
System.out.println(bank3);

}
}
