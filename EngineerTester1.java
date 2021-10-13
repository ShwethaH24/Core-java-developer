class EngineerTester1{

public static void main(String a[]){

Mechanical mechanical=new Mechanical();
mechanical.name="SanguH";
mechanical.branch="Mechanical Engineer";
mechanical.usn=15;
mechanical.semester=6;
mechanical.subject="Kinamatics of Machine";
String store=mechanical.store();
System.out.println(store);
mechanical.displayDetails();

}
}


