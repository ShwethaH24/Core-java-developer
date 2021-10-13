class CompanyTester1{

public static void main(String a[]){

Tcs  tcs=new Tcs();
tcs.employeename="Kavya";
tcs.headquator="Mysore";
tcs.revenue=1900;
tcs.year=1956;

String store=tcs.store();
System.out.println(store);
tcs.displayDetails();

}
}

