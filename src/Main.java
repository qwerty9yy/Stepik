import java.io.*;

public class Main {
    public static void main(String[] args) {
        String text = "Привет мир!"; // строка для записи
        try(FileOutputStream fos = new FileOutputStream("H:\\java\\GitHabSTEPIK\\primer.txt");
            PrintStream printStream = new PrintStream(fos))
        {
            printStream.println(text);
            System.out.println("Запись в файл произведена");
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}