import java.util.Scanner;

public class Separate
{
    public static void separation(double num)
    {
        String temp = Double.toString(num);
        int count = 0;
        for(int i=0;i<temp.length();i++)
        {
            if(temp.charAt(i) == '.')
            {
                count = i;
                break;
            }
        }
        for(int i=0;i<count;i++)
        {
            System.out.print(temp.charAt(i));
        }
        System.out.print(" ");
        for(int i=count+1;i<temp.length();i++)
        {
            System.out.print(temp.charAt(i));
        }

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double num = 0.0f;
        System.out.print("Enter the number(in decimal points) : ");
        num = sc.nextDouble();
        Separate.separation(num);

        sc.close();
    }
}
