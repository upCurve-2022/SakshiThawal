import java.util.Scanner;

public class Power
{
    public static int power(int num,int exp)
    {
        int ans = 1;
        for(int i=1;i<=exp;i++)
        {
            ans *= num;
        }

        return ans;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num, exp;
        System.out.print("Enter the number and exponent : ");
        num = sc.nextInt();
        exp = sc.nextInt();

        System.out.print("Answer is : " +Power.power(num,exp));

        sc.close();

    }
}
