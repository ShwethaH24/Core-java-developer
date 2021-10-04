public class GoldDTO{

public GoldDTO(){
System.out.println("GoldDTO object is created");
}

private long goldId;
private String shop;
private String address;


public long getGoldId(){
return goldId;
}

public void setGoldId(long goldId){
this.goldId=goldId;
}
public String getShop(){
return shop;
}

public void setShop(String shop){
this.shop=shop;
}

public String getAddress(){
return address;
}

public void setAddress(String address){
this.address=address;
}
}



