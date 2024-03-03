import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter scond number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter operator: ");
        char operator = scanner.next().charAt(0);
        double num;
        switch (operator){
            case '+':
                num = num1 + num2;
                System.out.println(num);
                break;
            case '-':
                num = num1 - num2;
                System.out.println(num);
                break;
            case '*':
                num = num1 * num2;
                System.out.println(num);
                break;
            case '/':
                num = num1 / num2;
                System.out.println(num);
                break;
            default:
                System.out.println("Invalid Value");
        }
        scanner.close();
    }
}

