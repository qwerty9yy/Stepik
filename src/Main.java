import java.io.*;

public class Main {
    public static void main(String[] args) {
        byte[] array1 = new byte[]{1, 3, 5, 7};
        ByteArrayInputStream byteStream1 = new ByteArrayInputStream(array1);
        int b;
        while((b = byteStream1.read()) != -1) {
            System.out.print(b);
        }
        String text = "Hello word!";
        byte[] array2 = text.getBytes();
        //Считываем 5 символов
        ByteArrayInputStream byteStream2 = new ByteArrayInputStream(array2, 0, 5);
        int c;
        while((c = byteStream2.read()) != -1) {
            System.out.print((char)c);
        }
    }
}