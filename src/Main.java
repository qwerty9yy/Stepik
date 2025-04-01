import java.io.*;

public class Main{
    public static void main(String[] args) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        String text = "Hello Wolrd!";
        byte[] buffer = text.getBytes();
        try {
            baos.write(buffer);
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        try(FileOutputStream fos = new FileOutputStream("hello.txt")) {
            baos.writeTo(fos);
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}