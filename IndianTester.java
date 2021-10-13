class IndianTester{

public static void main(String a[]){

Bank bank = new IndianBank();
IndianBank indianBank=(IndianBank)bank;
bank.provideLoans(2.4); 
System.out.println(bank);

Bank bank1=new IndianBank();
bank1.provideLoans(3.2);
System.out.println(bank1);

Bank bank2=new IndianBank();
bank2.provideLoans(3.6);
System.out.println(bank2);

Bank bank3=new IndianBank();
bank3.provideLoans(7.1);
System.out.println(bank3);

Bank bank4=new IndianBank();
bank4.provideLoans(45);
System.out.println(bank);



}
}
