import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] num = text.split(" ");
        double a, b;
        try{
            a = Double.parseDouble(num[0]);
            b = Double.parseDouble(num[2]);
            String ops = num[1];
            if (!ops.equals("+") && !ops.equals("-") && !ops.equals("*") && !ops.equals("/")){
                System.out.println("Operation Error!" );
            }
            switch (ops) {
                case "+":
                    System.out.println(a + b);
                    break;
                case "-":
                    System.out.println(a - b);
                    break;
                case "*":
                    System.out.println(a * b);
                    break;
                case "/":
                    System.out.println(b == 0 ? "Error! Division by zero" : a / b);
                    break;
            }
        } catch (Exception ex){
            System.out.println("Error! Not number");
        }
    }
}