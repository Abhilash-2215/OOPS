public class MethodOverload{
    void add(int a , int b)
    {
        System.out.println(a+b);
    }
    void add(int a, int b , int c){
        System.out.println(a+b+c);

    }
    
}
class Main{
    public static void main(String[] args) {
        MethodOverload a = new MethodOverload();
        a.add(10, 20);
        a.add(10, 20, 30);
        
        
    }
}
