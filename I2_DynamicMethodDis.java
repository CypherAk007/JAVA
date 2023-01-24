class A{
  public void show(){
    System.out.println("Inside A show");
  }
}

class B extends A{
  public void show(){
    System.out.println("Inside B show");
  }
}

class C extends A{
  public void show(){
    System.out.println("Inside C show");
  }
}

public class I2_DynamicMethodDis {
  public static void main(String[] args) {
    A obj = new A();
    obj.show();

    obj = new B();
    obj.show();

    obj = new C();
    obj.show();
  }
}
