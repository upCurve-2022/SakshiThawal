import java.util.Scanner;

public class Swapping
{
    static int num1,num2,num3;

    public static void swapTwo()
    {
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }

    public static void swapThree()
    {
        num1 = num1 + num2 + num3;

        num2 = num1 - (num2 + num3);

        num3 = num1 - (num2 + num3);

        num1 = num1 - (num2 + num3);
    }

    public static void main(String[] args)
    {
//        int num1,num2,num3;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number 1 : ");
        Swapping.num1 = sc.nextInt();
        System.out.print("Enter the number 2 : ");
        Swapping.num2 = sc.nextInt();
        System.out.print("Enter the number 3 : ");
        Swapping.num3 = sc.nextInt();

        int choice = 0;
        System.out.print("\n1----> Swapping of two numbers" +
                         "\n2-----> Swapping of three numbers : ");
        choice = sc.nextInt();

        if(choice == 1)
        {
            Swapping.swapTwo();
            System.out.print("After swapping first two numbers "+num1+" "+num2);
        }
        else if(choice == 2)
        {
            Swapping.swapThree();
            System.out.print("After swapping first three numbers " + num1 + " " + num2 + " " + num3);
        }
        else
            System.out.println("Invalid choice!");

        sc.close();

    }
}
