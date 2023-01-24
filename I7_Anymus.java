class A{
  public void show(){
    System.out.println("in A show!!");
  }
}

// class B extends A{
//   public void show(){
//     System.out.println("in B show!!");
//   }
// }


public class I7_Anymus {
  public static void main(String[] args) {
    // A obj = new A();
    // obj.show();
    
    // A obj1 = new B();
    // obj1.show();
    
    A obj = new A(){
      public void show(){
        System.out.println("in B show!!");
      }
    };
    obj.show();
  }
}
