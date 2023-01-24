interface Computer{
   void code();
  
}


class Laptop implements Computer{
  public void code(){
    System.out.println("code,run,compile");
  }
}
class Desktop implements Computer{
  public void code(){
    System.out.println("code,run,compile,Faster");
  }

}
class Developer{
  public void devApp(Computer lap){
    lap.code();
  }
}


public class I9_InterfaceUses {
  public static void main(String[] args) {
    Computer lap = new Laptop();
    Computer des = new Desktop();
    Developer abhishek = new Developer();
    abhishek.devApp(lap);    
    abhishek.devApp(des);
  }
}
