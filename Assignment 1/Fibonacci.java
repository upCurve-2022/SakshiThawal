import java.util.Scanner;

public class Fibonacci
{
    public static void fibonacci(int term)
    {
       int n1=0,n2=1,n3;
       for(int i=2;i<term;i++)
       {
           n3 = n1+n2;
           System.out.print(n3+ " ");
           n1 = n2;
           n2 = n3;
       }

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the term : ");
        int term = sc.nextInt();

        System.out.print("0 1 ");
        Fibonacci.fibonacci(term);

        sc.close();

    }
}
