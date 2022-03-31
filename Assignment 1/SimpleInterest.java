import java.util.Scanner;

public class SimpleInterest
{
    public static float simpleInterest(float principalAmount,float rate,int time)
    {
        return (principalAmount*rate*time)/100;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float principalAmount,rate = 0.0f;
        int time;

        System.out.print("Enter the initial principal amount :");
        principalAmount = sc.nextFloat();
        System.out.print("Enter the annual interest rate : ");
        rate = sc.nextFloat();
        System.out.print("Enter the time(in years) : ");
        time = sc.nextInt();

        System.out.println("Simple Interest is "+SimpleInterest.simpleInterest(principalAmount,rate,time));
        sc.close();
    }
}
