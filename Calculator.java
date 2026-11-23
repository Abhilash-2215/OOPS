import java.util.Scanner;
public class Calculator {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a:");
        int a = sc.nextInt();
        System.out.println("enter value of b:");
        int b = sc.nextInt();
        System.out.println("enter the operators (+,-,*/)");
        char operator = sc.next().charAt(0);
        int output;

        switch(operator)
        {
            case '+' :
                output=a+b;
                System.out.println("the result is:"+output);
                break;
            case '-':
                output=a-b;
                System.out.println("the result is:"+output);
                break;
            case '*':
                output=a*b;
                System.out.println("the result is:"+output);
                break;
            case '/':
                output=a/b;
                System.out.println("the result is:"+output);
                break;
            default :
                System.out.println("invalid");

            
        }


    }
}
