class Student{
  int rollno;
  String name;
  double marks;
  Student(int r,String n,double m){
    this.rollno = r;
    this.name=n;
    this.marks=m;
  }
  public void printdetails(){
    System.out.println(this.rollno + " "+this.name+" "+this.marks);
  }
}

public class O6_ArrayObject {
  public static void main(String[] args) {
    Student s1= new Student(1,"ak",100);
    Student s2= new Student(2,"bk",90);
    Student s3= new Student(3,"ck",80);
    
    Student students[] = new Student[3];
    students[0]=s1;
    students[1]=s2;
    students[2]=s3;

    for(int i =0;i<students.length;i++){
      students[i].printdetails();
    }
    
  }
  
}
