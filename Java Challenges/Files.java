import java.io.*;
import java.util.Scanner;

public class Files
{
    public static void writeFile(File f)
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            FileOutputStream fout = new FileOutputStream("Sample.txt");
            String str = new String();
            System.out.print("What do you want to write in file? : ");
            str = sc.nextLine();
            byte b[]=str.getBytes();//converting string into byte array
            fout.write(b);
            fout.close();
            System.out.println("Successfully wrote to the file.");
        }
        catch (IOException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void copyFile(File f)
    {
        String sourceFile, destFile, line, content="";
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Name of Source File: ");
        sourceFile = scan.nextLine();
        try
        {
            FileReader fr = new FileReader(sourceFile);
            BufferedReader br = new BufferedReader(fr);

            for(line=br.readLine(); line!=null; line=br.readLine())
                content = content + line + "\n";

            br.close();

            System.out.print("Enter the Name of Destination File: ");
            destFile = scan.nextLine();

            try
            {
                FileWriter fw = new FileWriter(destFile);
                fw.write(content);
                fw.close();
                System.out.println("\nFile copied successfully!");
            }
            catch(IOException ioe)
            {
                System.out.println("\nSomething went wrong!");
                System.out.println("Exception: " +ioe);
            }
        }
        catch(IOException ioe)
        {
            System.out.println("\nSomething went wrong!");
            System.out.print("Exception: " +ioe);
        }

    }

    public static void main(String[] args)
    {
        File file = new File("Sample.txt");
        boolean result;
        try
        {
            result = file.createNewFile();
            if(result)
            {
                System.out.println("file created "+file.getCanonicalPath());
            }
            else
            {
                System.out.println("File already exist at location: "+file.getCanonicalPath());
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

//        Files.writeFile(file);
        Files.copyFile(file);
    }
}
