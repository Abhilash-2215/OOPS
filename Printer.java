public class Printer {
    void print(String text)
    {
        System.out.println("text:"+text);
    }
    void print(int number)
    {
        System.out.println("number:"+number);
    }
    void print(double decimal)
    {
        System.out.println("Decimal:"+decimal);
    }
    
}
class Main{
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print("Abhi");
        p.print(10);
        p.print(12.00);
    }
}
