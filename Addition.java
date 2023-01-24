public class Addition {
  private int a;
  private int b;
  private int c;
  private int result;
  private static String op;
  private static String dev;
  // int a;
  // int b;
  static {
    Addition.dev="calc";
    System.out.println(Addition.dev);
  }

  Addition(int a ,int b,String op){
    this.a = a ;
    this.b=b;
    Addition.op =op;

  }
  Addition(int a ,int b,int c,String op){
    this.a = a ;
    this.b=b;
    this.c=c;
    Addition.op=op;

  }
  public static void printDevice(){
    System.out.println(Addition.dev);
  }

  public void doAddition(){
    this.result = this.a+this.b+this.c;
  }

  public int getAddition(){
    return this.result;
  }

  public void printResult(){
    System.out.println(Addition.op+" "+this.result);
  }
  
}
