class JobsDTO{


private String name;
private String location;
private long salary;


public String Name(){
return name;
}

public void setName(String name){
this.name=name;
}

public String getLocation(){
return location;
}

public void setLocation(String location){
this.location=location;
}

public long getSalary(){
return salary;
}
public void setSalary(long salary){
this.salary=salary;
}

@Override
public String toString(){
return "JobsDTO - [name="+this.name+",location="+this.location+",salary="+this.salary+"]";
}
}