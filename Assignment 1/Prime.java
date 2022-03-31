import java.util.Scanner;

public class Prime
{
    public static boolean isPrime(int num)
    {
        if (num <= 1)
            return false;

        else if (num == 2)
            return true;

        else if (num % 2 == 0)
            return false;

        for (int i = 3; i <= Math.sqrt(num); i += 2)
        {
            if (num % i == 0)
                return false;
        }

        return true;
    }

    public static void primeNum(int num1,int num2)
    {
        System.out.print("Prime numbers between "+num1+" and "+num2+" ");
        for(int i=num1;i<num2;i++)
        {
            if(isPrime(i))
                System.out.print(i+ " ");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num1,num2;
        System.out.print("Enter the numbers : ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        Prime.primeNum(num1,num2);
        sc.close();

    }
}
