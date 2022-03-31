import java.util.Scanner;

public class ASCII
{
    public static int asciiValue(char any)
    {
        return (int) any;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the character : ");
        char c = sc.next().charAt(0);
        System.out.print("ASCII value of character " + c + " is " + ASCII.asciiValue(c));
        sc.close();
    }
}
