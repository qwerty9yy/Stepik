import java.io.*;

public class Main {
    public static void main(String[] args){
        // получаем консоль
        Console console = System.console();
        if(console != null){
            // считываем данные с консоли
            String login = console.readLine("Введите логин:");
            char[] passwd = console.readPassword("Введите пароль:");

            console.printf("Введенный логин: %s \n", login);
            console.printf("Введенный пароль: %s \n", new String(passwd));
        }
    }
}