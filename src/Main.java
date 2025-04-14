import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try(BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            FileWriter fileWriter = new FileWriter("output.txt")){

            String line; //Переменная для хранения выражения
            while((line = reader.readLine()) != null){
                line = line.trim(); //Удаляем лишние пробелы
                if(line.isEmpty()) continue; //Пропускаяем пустые строчки
                String[] arr = line.split("\\s+"); //Разделяем на оюбое кол-во пробелов

                if(arr.length != 3){
                    fileWriter.write(line + " = Ошибка! Не правильное кол-во значений\n");
                    continue;
                }
                try{
                    //Перевод в Double
                    double a = Double.parseDouble(arr[0]);
                    double b = Double.parseDouble(arr[2]);

                    String ops = arr[1]; //Присвоение значения знака

                    if(!ops.equals("+") && !ops.equals("-") && !ops.equals("/") && !ops.equals("*")){
                        fileWriter.write(line + " = Знак не соответсвует заданию\n");
                    }

                    //Создание переменой для хранения ответа
                    double result = 0;
                    switch(ops){
                        case "+": result = a + b; break;
                        case "-": result = a - b; break;
                        case "/":
                            if(b == 0){
                                fileWriter.write(line + " = Делить на ноль нельзя\n");
                                continue;
                            }
                            result = a / b;
                            break;
                        case "*": result = a * b; break;
                        default: continue;
                    }
                    fileWriter.write(line + " = " + result + "\n");
                }catch(NumberFormatException ex){
                    fileWriter.write(line + " = Не число\n");
                }
            }
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}