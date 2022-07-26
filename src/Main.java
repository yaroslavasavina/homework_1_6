import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Задание 1. Сумма всех выплат за месяц.

        int[] arrayMonth = new int[30];
        int i;
        for (i = 0; i < arrayMonth.length; i++) {
            arrayMonth[i] = (int) Math.round((Math.random() * 100_000) + 100_000);
        }
        int sum = Arrays.stream(arrayMonth).sum();
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        System.out.println();

        // Задание 2. Найти минимальную и максимальную трату за день.

        int maxSumMonth = -1;
        for (final int k : arrayMonth) {
            if (k > maxSumMonth) {
                maxSumMonth = k;
            }
        }

        int minSumMonth = sum + 1;
        for (final int j : arrayMonth) {
            if (j < minSumMonth) {
                minSumMonth = j;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSumMonth + " рублей. Максимальная сумма трат за день составила " + maxSumMonth + " рублей.");

        System.out.println();

        // Задание 3. Средняя сумма трат за месяц.

        double averageSum = 0;
        for (int x : arrayMonth) {
            averageSum += x;
        }
        System.out.println("Средняя сумма трат за месяц составила " + averageSum / arrayMonth.length + " рублей.");

        System.out.println();

        // Задание 4.

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int q = reverseFullName.length - 1; q >= 0; q--) {
            System.out.print(reverseFullName[q]);
        }
    }
}