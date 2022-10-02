/**
 * есть форум, у которого есть комментарии с оценками.
 * Нам нужно заменить наихудшую оценку на среднее арифметическое всех других оценок, если разница минимальной оценки и второй по минимальности 3 и более.
 * (Оценки могут быть от 0 до 10)
 * Входные данные: массив, до 100 элементов
 *
 */

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        int averageScore;
        int sum;
        sum=0;
        int temp = 0;
        int[] score;

        score = new int[5];
        for (int i = 0; i < score.length; i++) {
            System.out.println("Введите оценки от 1 до 10 с форума");
            Scanner scanner = new Scanner(System.in);
            score[i] = scanner.nextInt();
        }
        System.out.println("Реальные оценки с форума: ");
        for (int i = 0; i < score.length; i++) {
            System.out.print(score[i] + " ");
        }
        sortMassive(score);

        System.out.println();

        int [] sorted_scores;
        sorted_scores=score;
        int x = 0;
        x = Math.abs (sorted_scores[0] - sorted_scores[1]);
            if (x >= 3) {
                System.out.println("Требуется замена оценки");
                for (int i = 1; i < sorted_scores.length; i++) {
                    temp = sum + sorted_scores[i];
                    sum = temp;
                }
                averageScore = sum / (sorted_scores.length - 1);
                System.out.println("Средняя оценка без учета худшей = " + averageScore);
                System.out.println("На форуме будут показаны оценки: ");
                sorted_scores[0] = averageScore;
                for (int i = 0; i < sorted_scores.length; i++) {
                    System.out.print(score[i] + " ");
                }
            } else
                System.out.println("Не требуется замена");

            //compareScore (score);



    }

    public static int[] sortMassive(int... score) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < score.length-1; i++) {
                if (score[i] > score[i + 1]) {
                    temp = score[i];
                    score[i] = score[i + 1];
                    score[i + 1] = temp;
                    sorted = false;
                }
            }
        }

        return score;
    }

}





