class Info{
  private String name;
  private int age;

  // setters
  public void setName(String n){
    name=n;
    System.out.println("Name has been set");
  }
  
  public void setAge(int a){
    age=a;
    System.out.println("age has been set");
  }
  
  // getters
  public String getName(){
    return name;
  }

  public int getAge(){
    return age;
  }

}



public class O9_Encapsulation {
  public static void main(String[] args) {
    Info p1 = new Info();
    p1.setName("Abhishek");
    p1.setAge(16);
    System.out.println(p1.getName() +":"+p1.getAge());        
  }
}
