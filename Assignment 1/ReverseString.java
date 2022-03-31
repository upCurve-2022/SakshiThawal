import java.util.Scanner;

public class ReverseString
{
    public static String reverseString(String str)
    {
        String temp = "";
        for(int i=str.length()-1;i>=0;i--)
        {
            temp += str.charAt(i);
        }

        return temp;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String str = new String();
        System.out.print("Enter the string : ");
        str = sc.nextLine();

        System.out.print("Reverse of " + str + " is " + ReverseString.reverseString(str));

        sc.close();
    }
}
