import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];

        int sum =0;

        System.out.println("enter the elements of array:");
        for(int i = 0;i<size;i++)
        {
            arr[i]=sc.nextInt();
            sum +=arr[i];

        }
        int min = arr[0];
        int max = arr[0];

        for(int i = 0; i<size;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];

            }
            if(arr[i]>max)
            {
                max=arr[i];
            }

        }
        System.out.println("min"+min);
        System.out.println("max"+max);
        System.out.println("average"+(sum/size));


    }
}
