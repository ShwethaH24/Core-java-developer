class CaneraTester{

public static void main(String a[]){
Bank bank = new CaneraBank();
CaneraBank caneraBank=(CaneraBank)bank;
bank.provideLoans(7.8); 
System.out.println(bank);

Bank bank1=new CaneraBank();
bank1.provideLoans(3.2);
System.out.println(bank1);

Bank bank2=new CaneraBank();
bank2.provideLoans(6.7);
System.out.println(bank2);

Bank bank3=new CaneraBank();
bank3.provideLoans(4.5);
System.out.println(bank3);

Bank bank4=new CaneraBank();
bank4.provideLoans();

}
}
