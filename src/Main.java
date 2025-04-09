import java.io.*;

public class Main {
    public static void main(String[] args){
        // определяем объект для каталога
        File myFile = new File("C://SomeDir//readme.txt");
        System.out.println("File name: " + myFile.getName());
        System.out.println("Parent folder: " + myFile.getParent());
        if(myFile.exists())
            System.out.println("Файл существует");
        else
            System.out.println("Файл не существует");
        System.out.println("File size: " + myFile.length());
        if(myFile.canRead())
            System.out.println("Файл может быть прочитан");
        else System.out.println("Файл нельзя прочитать");
        if(myFile.canWrite())
            System.out.println("Файл может быть записан");
        else System.out.println("Файл не может быть записан");
        // создадим новый файл
        File newFile = new File("C://SomeDir//new1");
        try{
            boolean new1 = newFile.createNewFile();
            if(new1)
                System.out.println("Файл создан");
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}