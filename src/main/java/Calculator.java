import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double num1;
        double ans;
        char op;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter one numbers: ");
        num1 = scanner.nextInt();
        System.out.print("\nEnter an operator (+, -, *, /): ");
        op = scanner.next().charAt(0);
        System.out.print("Enter two numbers: ");
        double num2;
        num2 = scanner.nextInt();
        switch(op) {
            case '+': ans = num1 + num2;
                break;
            case '-': ans = num1 - num2;
                break;
            case '*': ans = num1 * num2;
                break;
            case '/': ans = num1 / num2;
                break;
            default:  System.out.println("Error! Enter correct operator");
                return;
        }
        System.out.print("\nThe result is given as follows:\n");
        System.out.println(num1 + " " + op + " " + num2 + " = " + ans);
    }
}

