//Concept of encapsulation

public class Car {
    private int Speed=300;
    public void getter(){
        System.out.println(Speed);
    }
    public void setter(int s)
    {
        Speed = s;
    }
}
class Main{
    public static void main(String[] args) {
     Car c = new Car();
     c.getter();
     c.setter(1000);
     c.getter();

    }
} 
