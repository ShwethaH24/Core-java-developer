class SBITester{

public static void main(String a[]){
Bank bank = new SBIBank();
SBIBank sbiBank=(SBIBank)bank;
bank.provideLoans(6); 
System.out.println(bank);


Bank bank1=new SBIBank();
bank1.provideLoans(9.2);
System.out.println(bank1);


Bank bank2=new SBIBank();
bank2.provideLoans(2.3);
System.out.println(bank2);


Bank bank3=new SBIBank();
bank3.provideLoans(67);
System.out.println(bank3);


Bank bank4=new SBIBank();
bank4.provideLoans(456);
System.out.println(bank4);


Bank bank5=new SBIBank();
bank5.provideLoans(44);
System.out.println(bank5);

}
}
