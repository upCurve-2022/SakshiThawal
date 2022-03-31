import java.util.Scanner;

public class LargestNum
{
    public static int largestNum(int num1,int num2,int num3)
    {
        return (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.print("Largest number is : " + LargestNum.largestNum(num1,num2,num3));
        sc.close();
    }
}
