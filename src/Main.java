import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] arr = text.split(" ");
        double a, b;

        File file = new File("input.txt");
        try(FileWriter fileWriter = new FileWriter(file)){
            fileWriter.write(text);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        try(FileWriter fw = new FileWriter("input.txt", true)){
            a = Double.parseDouble(arr[0]);
            b = Double.parseDouble(arr[2]);
            String ops = arr[1];
            if(!ops.equals("+") && !ops.equals("-") && !ops.equals("*") && !ops.equals("/")){
                fw.write("Operation Error!");
            }
            try{
                Double.parseDouble(a);
            }

            double sum;
            switch (ops) {
                case "+":
                    sum = a + b;
                    fw.write("Result: " + sum);
                    break;
                case "-":
                    sum = a - b;
                    fw.write("Result: " + sum);
                    break;
                case "*":
                    sum = a * b;
                    fw.write("Result: " + sum);
                    break;
                case "/":
                    sum = a / b;
                    fw.write(b == 0 ? "Error! Division by zero" : "Result: " + sum);
                    break;
            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        //Чтение из файла
//        try(FileReader fileReader = new FileReader(file)){
//            char[] buffer = new char[(int)file.length()];
//            fileReader.read(buffer);
//            System.out.print(new String(buffer));
//        }catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }

    }
}