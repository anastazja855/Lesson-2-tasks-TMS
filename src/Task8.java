/**
 * есть сервис, который дает информацию о погоде на каждый день месяца.
 * Нужно найти среднюю температуру за месяц.
 * ходные данные:  программа должна работать с массивами размерностей 28 - 31
 */

import org.jetbrains.annotations.NotNull;

public class Task8 {
    public static void main(String[] args) {

        int x;
        double averagetemp;
        countAverageTemp(30, 31, 25, 26, 20, 25, 30, 24, 10, 10, 10);

    }

    static void countAverageTemp(Integer... temp) {
        int x = 0;
        double averagetemp;
        for (int i = 0; i < temp.length; i++) {
            int sum = x + temp[i];
            x = sum;
        }
        averagetemp = x / temp.length;
        System.out.println("Средняя температура за месяц составила " + averagetemp);
    }
}

