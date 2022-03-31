import java.util.Scanner;

public class ReverseNumber
{
    public static void reverseNum(int num)
    {
        String temp = Integer.toString(num);
        for(int i=temp.length()-1;i>=0;i--)
        {
            System.out.print(temp.charAt(i));
        }
    }
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        ReverseNumber.reverseNum(num);
        sc.close();

    }
}
