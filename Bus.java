class Bus{

public int busId ; 
public String busName ; 
public String location;

public Passenger passengers;

public Bus (){
System.out.println(this.getClass().getSimpleName() +" Object is created ");
}


public void setBusId(int busId){
this.busId = busId ; 
}

public void setBusName(String  busName){
this. busName =  busName ; 
}


public void setLocation(String location){
this.location = location ; 
}

public void setPassegers(Passenger passengers){
this.passengers = passengers ; 
}

@Override
public String toString(){
return "Bus - [busId = "+  this.busId+" , busName = "+ this.busName+" , location = "+ this.location+" , Passenger = "+this.passengers+"]";
}
}
