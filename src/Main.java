import java.io.*;

public class Main {
    public static void main(String[] args){
        String text = "Hello world!";
        try(FileOutputStream fos = new FileOutputStream("new.txt")) {
            //перевод строки в байты
            byte[] buffer = text.getBytes();
            fos.write(buffer, 0, buffer.length);
            System.out.println("The file has been written");
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}