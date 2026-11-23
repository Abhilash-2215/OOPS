
class SingleInt {
    void name(){
        System.out.println("Parent");
    }
}
 class Child extends SingleInt{

}

class Main{
    public static void main(String[] args) {
        Child ch = new Child();
        ch.name();
    }
}

