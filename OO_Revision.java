import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

interface C{
  int add(int i , int j);
}

class A{
  public void show(){
    System.out.println("in A show");
  }
  
  public void display1(){
    System.out.println("in A Display");
  }
}

class B extends A{
  public void show(){
    System.out.println("in B show");
  }
  
  public void display2(){
    System.out.println("in B Display");
  }
}                                                                                           
public class OO_Revision {
  public static void main(String[] args) {
    A obj = new B();
    // obj.show();
    // obj.display1();

    B obj1 = (B)obj;
    // obj1.display1();
    // obj1.display2();

    A obj2 = (A)obj1;
    // obj2.display1();
    

    B obj3 = new B();
    obj3.display1();
    obj3.display2();

    A obj4 = (A)obj3;
    obj4.display1();
    
    C obj5  = (i,j)->(i+j);
    System.out.println(obj5.add(4,5));
    
    Comparator<Integer> comp = new Comparator<Integer>() {
      public int compare(Integer i,Integer j){
        if (i%10>j%10){
          return 1;
        }
        else{
          return -1;
        }
      }
    };


    List<Integer> nums = new ArrayList<Integer>();
    nums.add(22);
    nums.add(13);
    nums.add(18);
    nums.add(10);
    nums.add(20);
    System.out.println(nums);

    Set<Integer> s =  new HashSet<Integer>();
    s.add(10);
    s.add(20);
    s.add(30);
    s.add(20);

    System.out.println(s);

    Collections.sort(nums,comp);
    System.out.println(nums);
  }  
}
