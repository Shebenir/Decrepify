import java.util.ArrayDeque;
import java.util.Deque;

public class DequeOperations {
    public static Deque<Integer> multiplyNumbers(Deque<Integer> num1, Deque<Integer> num2) {
        int size1 = num1.size();
        int size2 = num2.size();

        int[] result = new int[size1 + size2];

        for (int i = 0; i < size1; i++) {
            int digit1 = num1.removeLast();
            int carry = 0;

            for (int j = 0; j < size2; j++) {
                int digit2 = num2.removeLast();
                int temp = digit1 * digit2 + result[i + j] + carry;

                result[i + j] = temp % 10;
                carry = temp / 10;
            }

            if (carry > 0) {
                result[i + size2] += carry;
            }

            num2.addAll(num1);
        }

        Deque<Integer> product = new ArrayDeque<>();
        int i = result.length - 1;
        while (i >= 0 && result[i] == 0) {
            i--;
        }

        while (i >= 0) {
            product.add(result[i--]);
        }

        return product;
    }

    public static Deque<Integer> addNumbers(Deque<Integer> num1, Deque<Integer> num2) {
        Deque<Integer> sum = new ArrayDeque<>();
        int carry = 0;

        while (!num1.isEmpty() || !num2.isEmpty() || carry > 0) {
            int digit1 = !num1.isEmpty() ? num1.removeFirst() : 0;
            int digit2 = !num2.isEmpty() ? num2.removeFirst() : 0;

            int tempSum = digit1 + digit2 + carry;
            sum.add(tempSum % 10);
            carry = tempSum / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Deque<Integer> num1 = new ArrayDeque<>();
        num1.add(9);
        num1.add(9);
        num1.add(9);

        Deque<Integer> num2 = new ArrayDeque<>();
        num2.add(2);
        num2.add(3);

        Deque<Integer> product = multiplyNumbers(num1, num2);
        System.out.println("Произведение чисел: " + product);

        Deque<Integer> sum = addNumbers(num1, num2);
        System.out.println("Сумма чисел: " + sum);
    }
}