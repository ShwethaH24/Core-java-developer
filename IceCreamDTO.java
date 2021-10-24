class IceCreamDTO{


private String shop;
private String name;
private int cost;


public String Shop(){
return shop;
}

public void setShop(String shop){
this.shop=shop;
}

public String getName(){
return name;
}

public void setName(String name){
this.name=name;
}

public int getCost(){
return cost;
}
public void setCost(int cost){
this.cost=cost;
}

@Override
public String toString(){
return "IceCreamDTO - [shop="+this.shop+",name="+this.name+",cost="+this.cost+"]";
}
}