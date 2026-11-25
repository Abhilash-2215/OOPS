public class StudentDetails {
    public static void main(String[] args) {
        String details="saran,22,Java,85";
        String[] data = details.split(",");

        System.out.println("name:"+data[0]);
        System.out.println("Age:"+data[1]);
        System.out.println("Course:"+data[2]);
        System.out.println("Marks:"+data[3]);
    }
    
}
