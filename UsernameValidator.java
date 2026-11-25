public class UsernameValidator {
    String username="Admin";
    String enteredUsername="ADMIN";

    void display()
    {

    
    if(username.equalsIgnoreCase(enteredUsername))
    {
        System.out.println("Valid Username");
    }
    else
    {
        System.out.println("invalidusername");
    }
}
    
}
class Main
{
    public static void main(String[] args) {
        UsernameValidator v = new UsernameValidator();
        v.display();
    }
}
