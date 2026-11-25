public class PasswordChecker {
    String password="Java@123";
    String confirmPassword="Java@123";
    void display()
    {
        if(password.equals(confirmPassword))
        {
            System.out.println("passwords matched");
        }
        else
        {
            System.out.println("mismatched");
        }
        
    }
}
    class Main{
        public static void main(String[] args) {
            PasswordChecker p = new PasswordChecker();
            p.display();
        }
    }
    

