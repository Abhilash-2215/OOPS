public class EmailValidation {
    String email;

    EmailValidation(String email) {
        this.email = email;
    }

    void validate() {
        if (!email.isEmpty() &&
            email.contains("@") &&
            email.endsWith(".com") &&
            email.startsWith("student")) {

            System.out.println(email + " -> Valid Email");
        } else {
            System.out.println(email + " -> Invalid Email");
        }
    }

    public static void main(String[] args) {

        EmailValidation e1 = new EmailValidation("student123@gmail.com");
        EmailValidation e2 = new EmailValidation("studentabc@yahoo.com");
        EmailValidation e3 = new EmailValidation("user@gmail.com");

        e1.validate();
        e2.validate();
        e3.validate();
    }
}