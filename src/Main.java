import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] arr = text.split(" ");
        double a, b;

        //Создание файла для записи выражения
        File file = new File("input.txt");
        try(FileWriter fileWriter = new FileWriter(file)){
            fileWriter.write(text + "\n");
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        //Создание файла для записи ответа
        File file_answer = new File("output.txt");
        try(FileWriter fw = new FileWriter("output.txt", true)){
            try{
                a = Double.parseDouble(arr[0]);
                b = Double.parseDouble(arr[2]);
            }catch (NumberFormatException ex){
                fw.append("Error! Not number");
                return;
            }

            String ops = arr[1];
            if(!ops.equals("+") && !ops.equals("-") && !ops.equals("*") && !ops.equals("/")){
                fw.append("Operation Error!");
            }

            double sum;
            switch (ops) {
                case "+":
                    sum = a + b;
                    fw.append("Result: " + sum);
                    break;
                case "-":
                    sum = a - b;
                    fw.append("Result: " + sum);
                    break;
                case "*":
                    sum = a * b;
                    fw.append("Result: " + sum);
                    break;
                case "/":
                    sum = a / b;
                    fw.append(b == 0 ? "Error! Division by zero" : "Result: " + sum);
                    break;
            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        //Чтение из файла
        try(FileReader fileReader = new FileReader(file)){
            char[] buffer = new char[(int)file.length()];
            fileReader.read(buffer);
            System.out.print(new String(buffer));
        }catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        //Чтнение из файла ответа
        try(FileReader fileReader = new FileReader(file_answer)){
            char[] buffer = new char[(int)file_answer.length()];
            fileReader.read(buffer);
            System.out.println(new String(buffer));
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }

    }
}