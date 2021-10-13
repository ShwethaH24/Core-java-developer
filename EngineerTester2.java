class EngineerTester2{

public static void main(String a[]){

Civil civil=new Civil();
civil.name="Kavya Hadagali";
civil.branch="Civil Engineer";
civil.usn=15;
civil.semester=6;
civil.subject="Geo-technical Surveya";
String store=civil.store();
System.out.println(store);
civil.displayDetails();

}
}