import java.util.Scanner;
import java.lang.String;

public class Converter
{
    public static long decToBin(int num)
    {
        long binaryNum = 0,rem;
        int i = 1;

       while(num != 0)
       {
           rem = num%2;
           num /= 2;
           binaryNum += rem*i;
           i *= 10;
       }

       return  binaryNum;
    }

    public static int binToDec(int num)
    {
        int dec = 0,base = 1,temp = num;
        while(temp!=0)
        {
            int lastDigit = temp%10;
            temp = temp/10;
            dec += lastDigit*base;
            base = base*2;

        }

        return dec;

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number in decimal digit: ");
        int num = sc.nextInt();

        System.out.print(num + " is in binary form : " + Converter.decToBin(num));

        System.out.print("\nEnter the number in binary digit: ");
        num = sc.nextInt();

        System.out.print(num + " is in decimal form : " + Converter.binToDec(num));
        sc.close();
    }
}
