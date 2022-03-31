import java.util.Scanner;

public class PerfectSquare
{
    public static boolean isPerfectSquare(int num)
    {
        if (num >= 0)
        {
            int ps = (int)Math.sqrt(num);

            return ((ps * ps) == num);
        }
        return false;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        if(PerfectSquare.isPerfectSquare(num))
            System.out.print(num + " is perfect square.");
        else
            System.out.print(num + " is not perfect square.");

        sc.close();

    }
}
