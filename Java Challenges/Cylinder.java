import java.util.Scanner;

public class Cylinder
{
    static final float PI = 3.1415f;

    public static float volume(float radius,float height)
    {
        return (PI*radius*radius*height);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius and height : ");
        float radius = sc.nextFloat();
        float height = sc.nextFloat();

        System.out.print("Volume of cylinder is " + Cylinder.volume(radius,height) + " units");
        sc.close();
    }

}
