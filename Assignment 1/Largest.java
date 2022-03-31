import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Largest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Vector<Integer> nums = new Vector<>();

        int val;
        System.out.print("Enter the numbers : ");
        for(int i=0;i<3;i++)
        {
            val = sc.nextInt();
            nums.add(val);
        }

        Collections.sort(nums);

        System.out.println("Largest number is " + nums.get((nums.size() - 1)));
        System.out.print("Second Largest number is " + nums.get((nums.size() - 2)));




    }
}
