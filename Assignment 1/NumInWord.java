import java.util.Scanner;

public class NumInWord
{
    public static String getWord(char val)
    {
        if(val == '0')
            return "Zero";
        else if(val == '1')
            return "One";
        else if(val == '2')
            return "Two";
        else if(val == '3')
            return "Three";
        else if(val == '4')
            return "Four";
        else if(val == '5')
            return "Five";
        else if(val == '6')
            return "Six";
        else if(val == '7')
            return "Seven";
        else if(val == '8')
            return "Eight";
        else if(val == '9')
            return "Nine";
        else
            return "";
    }

    public static void numberInWord(int num)
    {
        String temp = Integer.toString(num);
        for(int i=0;i<temp.length();i++)
        {
            System.out.print(getWord(temp.charAt(i))+" ");
        }

    }
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        NumInWord.numberInWord(num);
        sc.close();
    }
}
