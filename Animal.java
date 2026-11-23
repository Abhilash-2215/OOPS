class Animal {
    String name;

    public void eat() {
        System.out.println(name + " is eating");
    }
}

class Dog extends Animal {
    String breed;

    public void bark() {
        System.out.println(name + " the " + breed + " is barking");
    }
}

class Main {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.name = "Tommy";
        d.breed = "German Shepherd";

        d.eat();
        d.bark();
    }
}