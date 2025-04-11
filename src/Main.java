import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine(); //Создали перемнную для ввода выражения
        String[] str = text.split(" ");//Разделяем на пробелы

        //Проверка для длину вводимых данных
        if(str.length != 3){
            System.out.println("The length does not match");
            return;
        }

    }
}