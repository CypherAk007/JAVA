class A{
  A(){
    super();
    System.out.println("in a");
  }
  A(int n){
    super();
    System.out.println("in a int");
  }
}

class B extends A{
  B(){
    super();
    System.out.println("in b");
  }

  B(int n){
    this();
    System.out.println("in b int");
  }
}





public class I0_Super {
  public static void main(String[] args) {
    B obj = new B(10);
  }
}
