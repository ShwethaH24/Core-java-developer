
class ShowRoom
{
public String ShowRoomName;
public int price;

public ShowRoom(String showroomName, int fees)
{
System.out.println("ShowRoom object is created");
showroomName=showroomName;
price=price;
System.out.println(showroomName+" "+fees);
}

public static void main(String a[])
{
ShowRoom showroom=new ShowRoom("Indian",1350);
ShowRoom showroom1=new ShowRoom("Woodan",1340);

}
}
