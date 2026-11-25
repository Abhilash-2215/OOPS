public class String2 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");

        System.out.println(sb.length());

        System.out.println(sb.toString().toUpperCase());

        System.out.println(sb.length());

        for (int i = 0; i < sb.length(); i++) {
            System.out.println(sb.charAt(i));
        }

        String a = "java";

        System.out.println(sb.toString().equals(a));
    }
}