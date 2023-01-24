abstract class Car{
  public abstract void drive();

  public abstract void startEngine();

  public abstract void seatBealt();

  public void playMusic(){
    System.out.println("Playing Music!!");

  }
}

class Wagon extends Car{
  @Override
  public void drive(){
    System.out.println("driving");
  }
  @Override
  public void startEngine(){
    System.out.println("Starting engine");

  }
  @Override
  public void seatBealt(){
    System.out.println("wear your bealt");
  }
  public void fly(){
    System.out.println("Flying");
  }
}



public class I5_AbstractClass {
  public static void main(String[] args) {
    Car c = new Wagon();    
    c.seatBealt();
    c.startEngine();
    c.playMusic();
    c.drive();
    // c.fly();
    Wagon w = (Wagon)c;
    w.fly();
    w.drive();
  }
}
