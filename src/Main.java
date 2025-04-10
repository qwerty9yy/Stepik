import java.io.*;

public class Main {
    public static void main(String[] args){
       File file = new File("My.txt");
       try(FileWriter writer = new FileWriter(file))
       {
           String text = "Это простой пример,\nв котором мы осуществляем\nс помощью языка Java\nзапись в файл\nи чтение из файла\n";
           writer.write(text);
       }catch(IOException ex) {
           System.out.println(ex.getMessage());
       }
       try(FileReader fr = new FileReader(file))
       {
           char[] buffer = new char[(int)file.length()];
           fr.read(buffer);
           System.out.print(new String(buffer));
       }catch(IOException ex){
           System.out.println(ex.getMessage());
       }
    }
}