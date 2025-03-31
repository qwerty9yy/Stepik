import java.io.*;

public class Main {
    public static void main(String[] args){
        try(FileInputStream fin = new FileInputStream("new.txt"))
        {
            byte[] bufer = new byte[256];
            System.out.println("File data:");

            int count;
            while((count = fin.read(bufer)) != -1)
            {
                for(int i = 0; i < count; i++)
                {
                    System.out.print((char)bufer[i]);
                }
            }
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}