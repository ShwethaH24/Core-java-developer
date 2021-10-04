class Sopa
{
public String SopaName;
public int fees;

public Sopa(String sopaName,int fees)
{
System.out.println("Sopa object is created");
sopaName=sopaName;
fees=fees; 
System.out.println(sopaName+" "+fees);
}

public static void main(String a[])
{
Sopa sopa=new Sopa("Furniture",1350);
Sopa sopa1=new Sopa("Woodan",1340);

}
}
