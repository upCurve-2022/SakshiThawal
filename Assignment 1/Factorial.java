import java.util.Scanner;

public class Factorial
{
    public static int factorial(int num)
    {
        int fact = 1,i=1;
        do
        {
            fact *= num;
            num--;
        }while(num!=1);

        return fact;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        System.out.print("Factorial of "+num+" is "+ Factorial.factorial(num));
        sc.close();

    }
}
