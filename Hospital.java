sclass Hospital{


public String hospitalName ; 
public String location;

public Patient  patients;

public Hospital (){
System.out.println(this.getClass().getSimpleName() +" Object is created ");
}


public void setHospitalName(String  hospitalName){
this.hospitalName =  hospitalName ; 
}


public void setLocation(String location){
this.location = location ; 
}

public void setPatients(Patient patients){
this.patients = patients ; 
}

@Override
public String toString(){
return "Hospital - [ hospital Name = "+ this.hospitalName+" , location = "+ this.location+" , Patient = "+this.patients+"]";
}
}
