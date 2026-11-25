public class MessageBuilder {
    String firstName="Java";
    String lastname="Developer";
    String result=firstName+lastname;
    void display()
    {
        System.out.println("Welcome"+result);;
    }
    
}
class Main{
    public static void main(String[] args) {
        MessageBuilder m = new MessageBuilder();
        m.display();
    }
}
