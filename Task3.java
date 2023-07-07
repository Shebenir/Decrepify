import java.util.ArrayList;
import java.util.List;

public class NumberListOperations {
    public static void removeEvenNumbers(List<Integer> numbers) {
        numbers.removeIf(number -> number % 2 == 0);
    }

    public static int findMinimum(List<Integer> numbers) {
        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static int findMaximum(List<Integer> numbers) {
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static double calculateAverage(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.size();
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(9);
        numbers.add(12);
        numbers.add(7);

        System.out.println("Исходный список: " + numbers);

        removeEvenNumbers(numbers);
        System.out.println("Список после удаления чётных чисел: " + numbers);

        int min = findMinimum(numbers);
        System.out.println("Минимальное значение: " + min);

        int max = findMaximum(numbers);
        System.out.println("Максимальное значение: " + max);

        double average = calculateAverage(numbers);
        System.out.println("Среднее значение: " + average);
    }
}
