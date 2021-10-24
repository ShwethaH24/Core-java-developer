class ContinentsDTO{

private long  population;
private String name;
private int area;


public long Population(){
return population;
}

public void setPopulation(long population){
this.population=population;
}

public String getName(){
return name;
}

public void setName(String name){
this.name=name;
}

public int getArea(){
return area;
}
public void setArea(int area){
this.area=area;
}



@Override
public String toString(){
return "ContinentsDTO - [population="+this.population+",name="+this.name+",area="+this.area+"]";
}
}