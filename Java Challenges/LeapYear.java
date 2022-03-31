import java.util.Scanner;

public class LeapYear
{
    public static boolean isLeapYear(int year)
    {
        boolean isLeap = false;

        if(year%4 == 0)
        {
            isLeap = true;

            if(year%100 == 0)
            {
                if(year%400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            }
        }

       return isLeap;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year : ");
        int yr = sc.nextInt();

        if(LeapYear.isLeapYear(yr))
            System.out.print(yr + " is leap year.");
        else
            System.out.print(yr + " is not leap year.");

        sc.close();

    }
}
