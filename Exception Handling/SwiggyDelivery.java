import java.util.Scanner;

public class SwiggyDelivery
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the zipcode : ");
        String z = sc.next();

        Delivery d = new Delivery(z);

        try
        {
            System.out.print(d.validate());
        }
        catch (Exception e)
        {
            System.out.print(e);
        }

        sc.close();

    }
}
