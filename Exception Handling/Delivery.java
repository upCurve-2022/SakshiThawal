class DeliveryException extends Exception
{
    public String toString()
    {
        return "No delivery available at this area! Sorry :(";
    }
}

public class Delivery
{
    String zipcode = "";

    Delivery(String zipcode)
    {
        this.zipcode = zipcode;
    }

    public String validate() throws DeliveryException
    {
        if(zipcode.equals("123") || zipcode.equals("456") || zipcode.equals("789"))
            throw new DeliveryException();

        return "Delivery available in your area!";

    }
}
