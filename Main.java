class Shape {
    String color;

    public void displayColor() {
        System.out.println("Color: " + color);
    }
}

class Circle extends Shape {
    double radius = 87.0;

    Circle() {
        color = "Blue";
    }

    public void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Circle Area: " + area);
    }
}

class Rectangle extends Shape {
    int length = 10;
    int width = 20;

    Rectangle() {
        color = "Red";
    }

    public void calculateArea() {
        double area = length * width;
        System.out.println("Rectangle Area: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Circle c = new Circle();

        r.displayColor();
        r.calculateArea();

        c.displayColor();
        c.calculateArea();
    }
}