class CompanyTester2{

public static void main(String a[]){

Ibm  ibm=new Ibm();
ibm.employeename="Kavana";
ibm.location="Mysore";
ibm.revenue=1900;
ibm.year=1946;

String store=ibm.store();
System.out.println(store);
ibm.displayDetails();

}
}

