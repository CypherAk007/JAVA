class Addition{
  int result;
  int a; 
  int b; 
  Addition(int a,int b){
    this.a = a;
    this.b = b;
  }
  public int doAddition(){
    System.out.println("class res is "+a+" and "+b);
    this.result = this.a +this.b;
    return result;
  }
  
  public int mul(int a,int b,int c){
    return a*b*c;
  }

  public int mul(int a, int b){
    return a*b;
  }

  public double mul(double a,int b){
    return a*b; 
  }
}


public class O3_ClassandObj {
  public static void main(String[] args) {
    System.out.println("Abhishek");
    int a=5;
    int b=10;
    int result;
    result =a+b;
    System.out.println(result);

    Addition a1 = new Addition(a,b);
    
    int res1 =  a1.doAddition();
    System.out.println(res1);

    System.out.println(a1.mul(a,b));
  }
  
}
