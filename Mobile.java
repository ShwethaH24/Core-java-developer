class Mobile{

public String mobileName; 
public long number;
public Sim  sims;

public Mobile (){
System.out.println(this.getClass().getSimpleName() +" Object is created ");
}

public void setMobileName(String mobileName){
this.mobileName = mobileName ; 
}

public void setNumber(long number){
this.number = number ; 
}
public void setSims(Sim sims){
this.sims = sims ; 
}

@Override
public String toString(){
return "Mobile -[mobileName = "+this.mobileName+" ,number = "+this.number+" , Sims = "+this.sims+"]";
}
}
