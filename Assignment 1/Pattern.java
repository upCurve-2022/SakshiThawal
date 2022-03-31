import java.util.Scanner;

public class Pattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int n = sc.nextInt();

        System.out.print("Pattern 1 ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.print("Pattern 2\n");
        for(int i=0;i<n;i++)
        {
            for(int k=n-i-1;k>=0;k--)
            {
                System.out.print(" ");
            }

            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }



        sc.close();

    }

}
