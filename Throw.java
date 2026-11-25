public class Throw {

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access Denied");
        } else {
            System.out.println("Access Granted");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Throw.checkAge(15);
    }
}