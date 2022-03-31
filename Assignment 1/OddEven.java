import java.util.Scanner;

public class OddEven
{
    public static String oddEven(int num)
    {
        if(num%2==0)
            return "even";
        else
            return "odd";
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Enter the number : ");
        num = sc.nextInt();

        System.out.print("The number is " + oddEven(num) + ".");

    }
}
