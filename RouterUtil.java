class RouterUtil{

public static void main(String a[]){

RouterDTO dto = new RouterDTO();
dto.setRouterId(45);
dto.setName("tp-link");
dto.setColor("white");
dto.setPrice(235);
//System.out.println(dto);//

RouterDTO dto1 = new RouterDTO();
dto1.setRouterId(44);
dto1.setName("Jio");
dto1.setColor("White");
dto1.setPrice(100);
System.out.println(dto1);
//System.out.println(dto1);//


RouterDTO dto2= new RouterDTO();
dto2.setRouterId(43);
dto2.setName("Hathway");
dto2.setColor("black");
dto2.setPrice(233);
//System.out.println(dto2);//

System.out.println("To String method used "+dto.toString());
System.out.println("To String method used "+dto1.toString());
System.out.println("To String method used "+dto2.toString());

}
}

