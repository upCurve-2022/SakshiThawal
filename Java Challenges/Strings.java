import java.util.Scanner;

public class Strings
{
    public static void uppercase(String any)
    {
        String temp = "";
        char x ;
        for(int i=0;i<any.length();i++)
        {
            if(any.charAt(i) >= 97 && any.charAt(i) <= 123)
            {
                x = (char)(any.charAt(i)-32);
                temp += x;
            }
            else
            {
                x = any.charAt(i);
                temp += x;
            }
        }

        System.out.print("String in uppercase is " + temp);
    }

    public static void concatenation(String any,String str)
    {
        String temp = "";

        for(int i=0;i<any.length();i++)
            temp += any.charAt(i);
        for(int i=0;i<str.length();i++)
            temp += str.charAt(i);

        System.out.print("Concatenated string is : "+ temp);

    }

    public static int countWords(String any)
    {
        int count = 1;

        for(int i=0;i<any.length();i++)
        {
            if(any.charAt(i) == ' ')
                count++;
        }

        return count;
    }

    public static boolean isContains(String any,String str)
    {
        return any.contains(str);
    }

    public static void replace(String any)
    {
        char[] temp = any.toCharArray();
        for(int i=0;i<temp.length;i++)
        {
            if(temp[i] == 'a')
            {
                temp[i] = '$';
            }
        }

        System.out.print("Replaced string is : ");
        for(int i=0;i<temp.length;i++)
        {
            System.out.print(temp[i]);
        }
    }

    public static void permutationsHelper(String str,String ans)
    {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            String ros = str.substring(0, i) +
                    str.substring(i + 1);

            permutationsHelper(ros, ans + ch);
        }

    }

    public static void permutations(String str)
    {
        permutationsHelper(str,"");
    }

    public static void duplicateChar(String str)
    {
        int count;
        char string[] = str.toCharArray();

        System.out.println("Duplicate characters in a given string: ");
        for(int i = 0; i <string.length; i++)
        {
            count = 1;
            for (int j = i + 1; j < string.length; j++)
            {
                if (string[i] == string[j] && string[i] != ' ')
                {
                    count++;
                    string[j] = '0';
                }
            }
            if (count > 1 && string[i] != '0')
                System.out.println(string[i]);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String n = sc.nextLine();
        Strings.uppercase(n);
        System.out.print("\nEnter the string you want to concatenate : ");
        String s1 = sc.next();
        Strings.concatenation(n,s1);
        System.out.print("\nWords in string is/are : " + Strings.countWords(n));
        System.out.print("\nEnter the second string : ");
        String str = sc.next();
        if(Strings.isContains(n,str))
            System.out.print(n + " contains " + str);
        else
            System.out.print(n + " not contain " + str);

        System.out.println();
//        Strings.replace(n);
//        System.out.print("\nPermutations of GOD is : ");
//        Strings.permutations("GOD");
        Strings.duplicateChar(n);
        sc.close();
    }

}
