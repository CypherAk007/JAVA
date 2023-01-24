interface A{
  int age=10;
  String type = "Interface";

  void show();
  void config();

}

interface X extends A{
  void run();
}

class B implements X{
  public void show(){
    System.out.println("in show");
  }

  public void config(){
    System.out.println("in config");
  }

  public void run(){
    System.out.println("running");
  }

}

public class I8_Interface {
  public static void main(String[] args) {
    System.out.println(A.age);  
    System.out.println(A.type);
    X obj = new B();
    obj.show();
    obj.config();
    obj.run();
  }
}
