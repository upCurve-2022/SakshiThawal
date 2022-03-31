import java.util.Scanner;
import java.lang.Math;

public class Sequence
{
    public static void firstSeq(int num)
    {
        //4, 16, 36, 64.......N

        int start = 4,i=1;
        int temp = 4;

        do
        {
            temp = start * i * i;
            System.out.print(temp + " ");
            i++;

        }while(temp!=num || temp > num);
    }

    public static void secondSeq(int num)
    {
        // -1, 2, -3, 4, -5........N

        int val = 0;
        for(int i=1;i<=num;i++)
        {
            val = i;
            if(i%2==0)
                val = ~(i - 1);

            System.out.print(val+" ");
        }
    }

    public static void thirdSeq(int num)
    {
        // 1, 4, 27, 256, 3125 .............. N

        int val = 0;
        for(int i=1;i<=num;i++)
        {
            val = (int) (i*Math.pow(i,i-1));
            System.out.print(val+ " ");
        }
    }

    public static void fifthSeq(int num)
    {
        // 1, 4, 9, 25, 36, 49 ..................N

        for(int i=1;i<=num;i++)
        {
            System.out.print(i*i + " ");
        }
    }

    public static void sixthSeq(int num)
    {
        // 1, 5, 13, 29, 49, 77 .............. N

        int start = 1,val=1;

        for(int i=1;i<=num;i++)
        {
            System.out.print(val+ " ");
            start = 4*i;
            val += start;

        }
//        int start = 4,val=1,i=1;

//        System.out.print(i+" ");

//        do
//        {
//            val += start;
//            System.out.print(val + " ");
//            start *= 2;
//            i++;


//        }while(i!=num);

    }

    public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number : ");
            int num = sc.nextInt();

//            Sequence.firstSeq(num);
//            Sequence.secondSeq(num);
//            Sequence.thirdSeq(num);
//            Sequence.fifthSeq(num);
            Sequence.sixthSeq(num);
            sc.close();

    }
}
