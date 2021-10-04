class MusicalInstUtil{

public static void main(String a[]){

MusicalInstrument music=new MusicalInstrument();
 music.name="Guitar";
music.price=4000.67;
music.frequency="20hz";
music.type="Western"; 
System.out.println(music.name+" "+music.price+" "+music.frequency+" "+music.type);
music.play(music.name);

MusicalInstrument music1=new MusicalInstrument();
 music1.name="violin";
music1.price=7000.50;
music1.frequency="10hz";
music.type="Western"; 
System.out.println(music1.name+" "+music1.price+" "+music1.frequency+" "+music1.type);
music1.play(music.name);

}
}

