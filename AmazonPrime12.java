class AmazonPrime12{

static String movies[] = {"Shershah","Cindrella","RakthaCharitra","Jaathi Rathnalu","Robert","KGF2","Yuvaratna","Master","Lights Out","Quite Place"};
static String series[] = {"Mirzapur","The Family Man","Four More shots","Vampire Diaries","Mumbai Diaries","Originals","The last ship","Inside Edge","Panchayat"};

static String serie = "lories";

public static void main(String a[]){
System.out.println("main method started");
getSeries(series);

String series =getSeries(serie);
System.out.println(serie);

}


public static void getSeries(String[] series){
System.out.println("inside getseries method with string array parameters");
for(int i=0; i < series.length;i++){
System.out.println(series[i]);
}
}
public static String getSeries(String series){
System.out.println("inside getseries method");
return serie;
}
}