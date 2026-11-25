public class TextConverter {
    String message ="Welcome to java Programming";

    void display()
    {
        System.out.println(message.toUpperCase());
        System.out.println(message.toLowerCase());
    }
    
}
class Main{
    public static void main(String[] args) {
        TextConverter t = new TextConverter();
        t.display();
    }
}
