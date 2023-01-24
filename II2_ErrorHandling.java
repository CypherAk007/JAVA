class Div{
  private int result;
  Div(int a,int b){
    try{
      this.result = a/b;
      if(this.result==0){
        throw new ArithmeticException("The result is zero");
      }
    }
    catch(ArithmeticException e){
      this.result = a/1;
      
      System.out.println("Thats the default output"+e);

    }
    catch(Exception e){
      System.out.println("Somthing Went Wrong..."+e);
    }

    System.out.println(this.result);
    System.out.println("Have a nice day!!");

  }
}



public class II2_ErrorHandling {
  public static void main(String[] args) {
   Div a = new Div(8,0) ;

 } 
}
