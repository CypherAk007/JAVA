class Laptop{
  int price;
  String name;

  public String toString(){
    return this.name+" : "+this.price;
  }

  public boolean equals(Laptop obj2){
    return this.price==obj2.price && this.name==obj2.name;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + price;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    return result;
  } 

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Laptop other = (Laptop) obj;
    if (price != other.price)
      return false;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    return true;
  }

  
}



public class I3_ObjtoHash{
  public static void main(String[] args) {
    Laptop obj1 = new Laptop();
    obj1.name = "mac";
    obj1.price = 1000;
    
    Laptop obj2 = new Laptop();
    obj2.name = "mac";
    obj2.price = 100;

    System.out.println(obj1.equals(obj2));
    System.out.println(obj1);


  }
}