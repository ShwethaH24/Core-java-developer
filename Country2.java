class Country2{
static String[] countryName=new String[7];

public static void main(String a[]){
countryName[0]="India";
countryName[1]="Srilanka";
countryName[2]="England";
countryName[3]="SouthAfrica";
countryName[4]="USA";
countryName[5]="Pakistan";
countryName[6]="China";
getcountryNames();

}
public static void getcountryNames(){
System.out.println(countryName.length);
for(int z=0; z<countryName.length; z++){
System.out.println(countryName[z]+ " ");

}
}
}
