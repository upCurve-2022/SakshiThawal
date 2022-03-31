import java.util.Scanner;

public class ArmstrongNum
{
    public static boolean armStrongNum(int num)
    {
        int temp = num, digits=0, last=0, sum=0;

        while(temp>0)
        {
            temp = temp/10;
            digits++;
        }

        temp = num;
        while(temp>0)
        {
            last = temp % 10;
            sum +=  (Math.pow(last, digits));
            temp = temp/10;
        }
        if(num==sum)
            return true;
        else
            return false;

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number (3 digit) : ");
        int num = sc.nextInt();

        boolean ans = ArmstrongNum.armStrongNum(num);
        if(ans)
            System.out.print("The number is armstrong number");
        else
            System.out.print("The number is not armstrong number.");

        sc.close();
    }
}
