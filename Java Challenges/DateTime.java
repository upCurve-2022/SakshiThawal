import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime
{
    public static void currentDateTime()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd \nHH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }

    public static void main(String[] args)
    {
//        DateTime dt = new DateTime();
        DateTime.currentDateTime();
    }
}
