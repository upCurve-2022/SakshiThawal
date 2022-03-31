import java.util.Scanner;

public class Palindrome
{
    public static boolean palindromeString(String str)
    {
        int j=str.length()-1;
        for(int i=0;i<str.length()/2;i++)
        {
            if(str.charAt(i)!=str.charAt(j))
                return false;
            j--;
        }
        return true;

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String str = new String();
        System.out.print("Enter the string : ");
        str = sc.nextLine();

        boolean ans = Palindrome.palindromeString(str);
        if(ans)
            System.out.print(str + " is palindrome.");
        else
            System.out.print(str + " is not palindrome.");

        sc.close();
    }
}
