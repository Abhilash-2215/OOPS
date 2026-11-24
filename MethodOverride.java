class MethodOverride {
    void add(int a, int b) {
        System.out.println(a - b);
    }
}

class Hi extends MethodOverride {

    @Override
    void add(int a, int b) {
        System.out.println(a * b);
    }
}

class Main {
    public static void main(String[] args) {

        MethodOverride a = new Hi();
        MethodOverride b = new MethodOverride(); 

        a.add(10, 20);
        b.add(10, 30);
        
    }
}