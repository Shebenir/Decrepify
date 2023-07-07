//1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
/*
public class TriangularNumber {
    public static int calculateTriangularNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int n = 5; // Здесь можно указать любое значение n
        int triangularNumber = calculateTriangularNumber(n);
        System.out.println("n-ое треугольное число для n = " + n + " равно " + triangularNumber);
    }
}
 */

// 2) Вывести все простые числа от 1 до 1000

/*
public class PrimeNumbers {
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
 */

// 3) Реализовать простой калькулятор

/*
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.print("Выберите операцию (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = 0.0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Ошибка! Неверный оператор.");
                return;
        }

        System.out.println("Результат: " + result);

        scanner.close();
    }
}
 */