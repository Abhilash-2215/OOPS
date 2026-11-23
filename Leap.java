import java.util.Scanner;
public class Leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year:");
        int year = sc.nextInt();
        System.out.println("enter a number");
        int integer = sc.nextInt();
        if(integer % 2  == 0)
        {
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        if(year % 400x == 0)
        {
            System.out.println("leap year");
        }
        else{
            System.out.println("not a leap year");
        }

    }
}
