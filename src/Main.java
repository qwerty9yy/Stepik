import java.io.*;

public class Main {
    public static void  main(String[] args){
        try(FileInputStream fin = new FileInputStream("new.txt");
            FileOutputStream fos = new FileOutputStream("new_1.txt")){
            byte[] buffer = new byte[256];
            int count;
            //считываем буфер
            while((count = fin.read(buffer)) != -1){
                //записываем из буфера в файл
                fos.write(buffer, 0, count);
            }
            System.out.println("File has been written");
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}