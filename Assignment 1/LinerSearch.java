import java.util.Scanner;

public class LinerSearch
{
    public static int linerSearch(int data[],int num)
    {
        for(int i=0;i<data.length;i++)
        {
            if(data[i] == num)
                return i;
        }

        return -1;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number : ");
        int size = sc.nextInt();

        int data[] = new int[size];
        System.out.print("Enter the numbers : ");
        for(int i=0;i<size;i++)
        {
            data[i] = sc.nextInt();
        }

        System.out.print("Enter the number you want to search : ");
        int s = sc.nextInt();

        int ans = LinerSearch.linerSearch(data,s);

        if(ans == -1)
            System.out.print("Number is not found");
        else
            System.out.print("Number is found at index "+(ans+1));

        sc.close();

    }
}
