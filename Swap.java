import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a:");
        int a = sc.nextInt();
        System.out.println("value of a before  swapping"+a);
        System.out.println("enter the value of b:");
        int b = sc.nextInt();
        System.out.println("valeu of  b before swapping"+b);
        b=a*b;
        a=b/a;
        b=b/a;
        System.out.println("val of a after swap"+a);
        System.out.println("val of b after swap"+b);

    }
    
}
