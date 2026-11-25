public class EmailChecker {
    public static void main(String[] args) {

        String email = "student@gmail.com";

        if (email.contains("@")) {
            System.out.println("Email contains @ symbol");
        } else {
            System.out.println("Email does not contain @ symbol");
        }

        if (email.contains("gmail")) {
            System.out.println("Email is a Gmail address");
        } else {
            System.out.println("Email is not a Gmail address");
        }
    }
}