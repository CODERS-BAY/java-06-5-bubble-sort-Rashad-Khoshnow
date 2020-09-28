import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("First Number: ");
        double num1 = sc.nextDouble();
        System.out.println("operator? ");
        String cal = sc.next();
        System.out.println("Second Number: ");
        double num2 = sc.nextDouble();


        switch (cal){
            case "+" -> add (num1, num2);
            case "-" -> sub (num1, num2);
            case "*" -> mult (num1, num2);
            case "/" -> div (num1, num2);

        }


    }
    public static void add (double num1, double num2) {
        System.out.println(num1 + num2);
    }
    public static void sub (double num1, double num2) {
        System.out.println(num1 - num2);
    }
    public static void mult (double num1, double num2) {
        System.out.println(num1 * num2);
    }
    public static void div (double num1, double num2) {
        System.out.println(num1 / num2);
    }
}
