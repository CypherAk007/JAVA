import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
  String name;
  int rollNo;
  Student(String name,int rollNo){
    this.name = name;
    this.rollNo = rollNo;
  }
  public String toString(){
    return "Student: "+this.name+" rollNo: "+this.rollNo;
  }
}


public class II7_SortObjects {
  public static void main(String[] args) {
    // Comparator<Student> comp = new Comparator<Student>() {
    //   public int compare(Student i , Student j){
    //     if(i.rollNo>j.rollNo){
    //       return 1;
    //     }
    //     else{
    //       return -1;
    //     }
    //   }
    // };
    
    // OR USING LAMBDA FUNC
    Comparator<Student> comp = (i , j)->i.rollNo>j.rollNo?1:-1;
        
    List<Student> studs = new ArrayList<Student>();
    studs.add(new Student("Abhishek",1));
    studs.add(new Student("ak",2));
    studs.add(new Student("dk",10));
    studs.add(new Student("ck",12));
    studs.add(new Student("mk",2));
    for(Student s: studs){
      System.out.println(s);
    }
    // System.out.println(studs);
    Collections.sort(studs,comp);
    // System.out.println(studs);
    for(Student s: studs){
      System.out.println(s);
    }
  }

}
