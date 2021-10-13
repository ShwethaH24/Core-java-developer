class EngineerTester3{

public static void main(String a[]){

Chemical chemical=new Chemical();
chemical.name="Kavya Hadagali";
chemical.branch="Chemical Engineer";
chemical.usn=15;
chemical.semester=1;
chemical.subject="Programming in C datastructure";
chemical.emailid= "kavyaH@gmail.com";
String store=chemical.store();
System.out.println(store);
chemical.displayDetails();

}
}