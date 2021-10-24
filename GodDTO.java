class GodDTO{


private String name;
private String place;
private int distance;




public String getName(){
return name;
}

public void setName(String name){
this.name=name;
}

public String getPlace(){
return place;
}
public void setPlace(String Place){
this.place=place;
}

public int getDistance(){
return distance;
}
public void setDistance(int distance){
this.distance=distance;
}


@Override
public String toString(){
return "RouterDTO - [name="+this.name+",place="+this.place+",distance="+this.distance+"]";
}
}