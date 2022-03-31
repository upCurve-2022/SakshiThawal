import java.util.Scanner;

public class BinarySearch
{
//    public static int binarySearchHelper(int data[],int low,int high,int num)
//    {
//        int mid = (low+high)/2;
//
//        if(mid == num)
//            return data[mid];
//        else if(data[mid] < num)
//           binarySearchHelper(data,mid+1,high,num);
//        else
//            binarySearchHelper(data,low,mid-1,num);
//
//
//
//    }
    public static int binarySearch(int data[],int num)
    {
        int low = 0, high = data.length-1;

        int mid;
        while(low <= high)
        {
            mid=(low+high)/2;
            if(data[mid]==num)
                return mid;
            else if(data[mid]<num)
                low=mid+1;
            else
                high=mid-1;

        }
        return -1;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number : ");
        int size = sc.nextInt();

        int data[] = new int[size];
        System.out.print("Enter the numbers in sorted order : ");
        for(int i=0;i<size;i++)
        {
            data[i] = sc.nextInt();
        }

        System.out.print("Enter the number you want to search : ");
        int s = sc.nextInt();

        int ans = BinarySearch.binarySearch(data,s);
        if(ans == -1)
            System.out.print("Number is not found");
        else
            System.out.print("Number is found at index "+(ans+1));

        sc.close();

    }
}
