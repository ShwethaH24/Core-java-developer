class AmazonPrime11{

static String movies[] = {"Shershah","Cindrella","RakthaCharitra","Jaathi Rathnalu","Robert","KGF2","Yuvaratna","Master","Lights Out","Quite Place"};
static String series[] = {"Mirzapur","The Family Man","Four More shots","Vampire Diaries","Mumbai Diaries","Originals","The last ship","Inside Edge","Panchayat"};

static String series = "Dia";

public static void main(String a[]){
System.out.println("main method started");
getseries(series);

String mov =getserie(series);
System.out.println(series);

}


public static void getserie(String[] series){
System.out.println("inside getmovies method with string array parameters");
for(int i=0; i < series.length;i++){
System.out.println(series[i]);
}
}
public static String getserie(String series){
System.out.println("inside getmovies method");
return serie;
}
}