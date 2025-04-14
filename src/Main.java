import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       try(BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
           FileWriter fileWriter = new FileWriter("output.txt")){

           String line;
           while((line = reader.readLine()) != null){
               line = line.trim();
               if(line.isEmpty()) continue;
               String[] arr = line.split("\\s+");

               if(arr.length != 3)
                   fileWriter.write(line + " = Ошибка! Не правильное кол-во\n");

               try {
                   double a = Double.parseDouble(arr[0]);
                   double b = Double.parseDouble(arr[2]);

                   String sign = arr[1];
                   if(!sign.equals("+") && !sign.equals("-") && !sign.equals("/") && !sign.equals("*")){
                       fileWriter.write(line + " = Знак не соответствует заданию\n");
                   }

                   double result;
                   switch(sign){
                       case "+": result = a + b; break;
                       case "-": result = a - b; break;
                       case "/":
                           if(b == 0){
                               fileWriter.write(line + " = на ноль делить нельзя\n");
                               continue;
                           }
                           result = a / b; break;
                       case "*": result = a * b; break;
                       default: continue;
                   }
                   fileWriter.write(line + " = " + result + "\n");
               }catch(NumberFormatException ex){
                   fileWriter.write(line + " = Не является числом\n");
               }
           }
       }catch(IOException ex){
           System.out.println("Ошибка: " + ex.getMessage());

       }
    }
}