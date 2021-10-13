class BankTester{

public static void main(String a[]){
Bank bank = new BandanBank();
BandanBank bandanBank=(BandanBank)bank;

bank.provideLoans(1.1);
System.out.println(bank);

Bank bank1 =new CaneraBank();
bank1.provideLoans(4.5);
System.out.println(bank1);

Bank bank2=new IndianBank();
bank2.provideLoans(5.6);

System.out.println(bank2);

}
}

