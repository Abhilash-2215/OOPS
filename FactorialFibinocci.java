import java.util.Scanner;

public class FactorialFibinocci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num for factorial");
        int num = sc.nextInt();

        int fac=1;
        for (int i = 1 ;i <=num ; i++)
        {
            fac=fac*i;
        }
        System.out.println("factorrial"+fac);

        System.out.println("enter a number for fibinovvi");
        int n = sc.nextInt();

        int a=0;int b = 1;
        System.out.println("series are:");
        for (int i = 1; i <= n; i++)
        {
            System.out.println(a+" ");
            int c = a+b;
            a=b;
            b=c;
        }
    }
}
