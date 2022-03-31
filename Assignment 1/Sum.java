import java.util.Scanner;

public class Sum
{
    public static int evenSum(int num)
    {
        int sum = 0;
        for(int i=0;i<=num;i=i+2)
        {
            sum += i;
        }
        return sum;
    }

    public static int oddSum(int num)
    {
        int sum = 0;
        for(int i=1;i<=num;i=i+2)
        {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        System.out.print("Even Sum : " + Sum.evenSum(num));
        System.out.println();
        System.out.print("Odd Sum : " + Sum.oddSum(num));

        sc.close();
    }
}
