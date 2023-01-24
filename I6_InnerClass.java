class A{
  int age;

  public void show(){
    System.out.println("in show");
  }

  class B{
    public void config(){
      System.out.println("in config");
    }
  }

}



public class I6_InnerClass {
  public static void main(String[] args) {
    A obj = new A();
    obj.age=10;
    System.out.println(obj.age);    

    A.B obj1 = obj.new B();
    obj1.config();
  }
}
