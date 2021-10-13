class CompanyTester3{

public static void main(String a[]){

Cognizant  cognizant=new Cognizant();
cognizant.employeename="Kavana";
cognizant.location="Mysore";
cognizant.revenue=1990;
cognizant.year=1944;

String store=cognizant.store();
System.out.println(store);
cognizant.displayDetails();

}
}

