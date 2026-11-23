public class Vehicle {
    String brand = "BMW";

    public void honk() {
        System.out.println("Beep! Beep!");
    }
}

class Car extends Vehicle {
    String model_name = "M6";

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model_name);
    }
}

class Main {
    public static void main(String[] args) {
        Car c = new Car();

        c.honk();
        c.displayDetails();
    }
}