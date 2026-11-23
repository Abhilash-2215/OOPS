public class Rectangle {
    private double length = 128.00;
    private double width = 108.00;

    public void getter() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }

    public void setter(double l, double w) {
        if (l >= 0) {
            length = l;
        } else {
            System.out.println("Invalid length");
        }

        if (w >= 0) {
            width = w;
        } else {
            System.out.println("Invalid width");
        }
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Main {
    public static void main(String[] args) {
        Rectangle c = new Rectangle();

        c.getter();

        System.out.println("Area: " + c.calculateArea());
        System.out.println("Perimeter: " + c.calculatePerimeter());

        c.setter(129.0, 160.0);

        c.getter();

        System.out.println("Area: " + c.calculateArea());
        System.out.println("Perimeter: " + c.calculatePerimeter());
    }
}