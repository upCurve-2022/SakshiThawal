import java.util.Scanner;

public class Average
{
    public static float average(int[] arr)
    {
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            sum += arr[i];
        }

        return (sum/arr.length);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter the values : ");
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("Average of elements is " + Average.average(arr));
        sc.close();

    }
}
