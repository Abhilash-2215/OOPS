public class Calculator1 {
    void add(int a, int  b){
        System.out.println(a+b);
    }
    void add(int a , int b , int c)
    {
        System.out.println(a+b+c);
    }
    
}
class Main{
    public static void main(String[] args) {
        Calculator1 c = new Calculator1();
        c.add(10,20);
        c.add(10,20,30);
    }
}
