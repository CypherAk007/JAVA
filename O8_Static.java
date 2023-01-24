class Mobile{
  static String modelname;
  static String brand;
  int price;
  int model;
  static{
    Mobile.modelname = "Phone";
    System.out.println("inside static");
  }
  Mobile(String b,int p,int m){
    Mobile.brand=b;
    this.price = p;
    this.model = m;
    System.out.println("inside constructor");
  }
  public void show(){
    System.out.println(Mobile.brand+" as "+this.model+" @ "+this.price);

  }
}

public class O8_Static {
  public static void main(String[] args) {
    Mobile m1 = new Mobile("apple",1500,14);
    Mobile.brand = "Samsung";
    System.out.println(Mobile.brand);
    m1.show();
    Mobile m2 = new Mobile("Apple",1600,15);
    System.out.println(Mobile.brand);
    m2.show();    
    System.out.println(Mobile.brand);
    System.out.println(Mobile.modelname);

  }
}
