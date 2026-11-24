public class Shape1 {
    void draw()
    {
        System.out.println("drawing shape");
    }
    
}
class Circle extends Shape1{
    @Override 
    void draw()
    {
        System.out.println("drawing circle");
    }
}
class Square extends Shape1{
    @Override
    void draw()
    {
        System.out.println("drawing square");
    }

}
class Main{
    public static void main(String[] args) {
        Shape1 s = new Circle();
        s.draw();
        Shape1 y = new Square();
        y.draw();
    }
}