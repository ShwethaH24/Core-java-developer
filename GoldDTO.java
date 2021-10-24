public class GoldDTO{

public GoldDTO(){
System.out.println("GoldDTO object is created");
}

private int goldId;
private String shop;
private String address;


public int getGoldId(){
return goldId;
}

public void setGoldId(int goldId){
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
@Override

public String toString(){

return "GoldDTO - [goldId="+this.goldId+",shop="+this.shop+",address="+this.address+"]";
}
}


