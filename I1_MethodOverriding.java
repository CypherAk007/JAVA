class Calc{
  public int add(int a,int b){
    return a+b;
  }
}

class AdvCalc extends Calc{
  public int add(int a,int b){
    return a+b+1;
  }
}



public class I1_MethodOverriding {
  public static void main(String[] args) {
    AdvCalc ac = new AdvCalc();
    System.out.println( ac.add(10,20));

  }
}
