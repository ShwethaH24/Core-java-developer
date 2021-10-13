class CompanyTester{

public static void main(String a[]){

Infosys  infosys=new Infosys();
infosys.name="Infosys";
infosys.headquator="Bangalore";
infosys.revenue=1800;

String store=infosys.store();
System.out.println(store);
infosys.displayDetails();

}
}

