class Ncr{
public static void main(String a[]){
int nCr=fact(4)/(fact(2)*(fact(4-2));
System.out.println(nCr);
}

System.out.println("main method started");
myFactorial(5);
System.out.println("main method ended");
}

public static void myFactorial(int num){
System.out.println("fact method started");
int fact=1;
for(int i=1;i<=num;i++){
fact=fact*i;
}

System.out.println(fact);
System.out.println("myFactorial method ended");
}
}

