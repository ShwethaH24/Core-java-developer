class DenaTester{

public static void main(String a[]){
Bank bank = new DenaBank();
DenaBank denaBank=(DenaBank)bank;
bank.provideLoans(1.5); 
System.out.println(bank);

Bank bank1=new DenaBank();
bank1.provideLoans(5.6);
System.out.println(bank1);

Bank bank2=new DenaBank();
bank2.provideLoans(3.2);
System.out.println(bank2);

Bank bank3=new DenaBank();
bank3.provideLoans(6.4);
System.out.println(bank3);

Bank bank4=new DenaBank();
bank4.provideLoans(7.11);
System.out.println(bank4);

Bank bank5=new DenaBank();
bank5.provideLoans(3.2);
System.out.println(bank5);

}
}
