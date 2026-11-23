public class Student {
    private String name = "Abhilash";
    private int rollno = 73;

    public void getter() {
        System.out.println(name);
        System.out.println(rollno);
    }

    public void setter(String s, int r) {
        name = s;
        rollno = r;
    }
}

class EncapTask {
    public static void main(String[] args) {
        Student x = new Student();

        x.getter();

        x.setter("ravi", 88);

        x.getter();
    }
}