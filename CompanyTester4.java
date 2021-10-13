class CompanyTester4{

public static void main(String a[]){

Microsoft microsoft=new Microsoft();
microsoft.employeename="Kavana";
microsoft.location="Mysore";
microsoft.revenue=1990;
microsoft.year=1944;
microsoft.salary=20000;

String store=microsoft.store();
System.out.println(store);
microsoft.displayDetails();

}
}

