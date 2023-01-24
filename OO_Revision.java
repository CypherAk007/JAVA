
public class OO_Revision {
  public static void main(String[] args) {
    // Type casting
    double num=10.10;
    System.out.println(num);
    int num2 =(int) num;
    System.out.println(num2);
    Addition n =new Addition(4,5,5,"ADD");
    n.doAddition();
    System.out.println(n.getAddition());
    n.printResult();
    Addition.printDevice();

  }  
}
