import java.util.Scanner;

public class scratch_14 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int operand1 = nextInt();
        char operation = getOperation();
        int operand2 = nextInt();
        int result1 = result(operand1, operand2, operation);
        System.out.println("Результат операции:" + result1);
    }
    public static int nextInt() {
        System.out.println("Введите число");
        int operand;
        if (scanner.hasNextInt()) {
            operand = scanner.nextInt();
        }
        else {
            System.out.println("Ошибка при вводе числа. Повторите ввод");
            scanner.next();
            operand = nextInt();
        }
        return operand;
    }
    public static char getOperation() {
        System.out.println("Введите операцию");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Ошибка при вводе операции. Повторите ввод");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }
    public static int result(int operand1, int operand2, char operation) {
        int result1;
        switch (operation) {
            case '+':
                result1 = operand1 + operand2;
                break;
            case '-':
                result1 = operand1 - operand2;
                break;
            case '*':
                result1 = operand1 * operand2;
                break;
            case '/':
                result1 = operand1 / operand2;
                break;
            default:
                System.out.println("Ошибка при вводе операции. Повторите ввод");
                result1 = result(operand1, operand2, getOperation());
        }
        return result1;
    }
}