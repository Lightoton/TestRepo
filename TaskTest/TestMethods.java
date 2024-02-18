package TaskTest;

public class TestMethods {
    // Метод для нахождения среднего значения массива
    public static double findAverage(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }
    // Метод для поиска максимального значения в массиве
    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    // Метод для вычисления суммы всех элементов массива
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int i = 0; i <= array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    // Метод для проверки является ли число простым
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
