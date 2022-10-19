/**
 * Средняя (4 балла)
 * <p>
 * Дата представлена строкой вида "15.07.2016".
 * Перевести её в строковый формат вида "15 июля 2016".
 * При неверном формате входной строки вернуть пустую строку
 * <p>
 * Обратите внимание: некорректная с точки зрения календаря дата (например, 30 февраля 2009) считается неверными
 * входными данными.
 */

package Lesson9_String;

import Lesson9_String.customExceptions.DateExceptions;

import java.util.Scanner;

public class TaskString {
    public static void main(String[] args) {
        System.out.println("Enter your date please. The date format should be DD.MM.YYYY\n");
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        try {
            convertDate(date);
        } catch (DateExceptions e) {
            e.getDateExceptions();
        }

    }


    public static void convertDate(String date) throws DateExceptions {

        StringBuilder stringBuilder = new StringBuilder(date);
        char c1 = stringBuilder.charAt(3);
        char c2 = stringBuilder.charAt(4);
        char d1 = stringBuilder.charAt(0);
        char d2 = stringBuilder.charAt(1);
        String day = new String(new char[]{d1, d2});
        int day_number = Integer.parseInt(day);
        String month = new String(new char[]{c1, c2});
        int month_number = Integer.parseInt(month);
        if (day_number > 31) {
            throw new DateExceptions();
        } else {
            switch (month_number) {
                case 1:
                    stringBuilder.replace(2, 6, " January ");
                    System.out.println(stringBuilder.toString());
                    break;


                case 2:
                    if (day_number <= 28) {
                        stringBuilder.replace(2, 6, " February ");
                        System.out.println(stringBuilder.toString());
                        break;
                    } else throw new DateExceptions();


                case 3:
                    stringBuilder.replace(2, 6, " March ");
                    System.out.println(stringBuilder.toString());
                    break;


                case 4:
                    if (day_number <= 30) {
                        stringBuilder.replace(2, 6, " April ");
                        System.out.println(stringBuilder.toString());
                        break;
                    } else throw new DateExceptions();


                case 5:
                    stringBuilder.replace(2, 6, " May ");
                    System.out.println(stringBuilder.toString());
                    break;


                case 6:
                    if (day_number <= 30) {
                        stringBuilder.replace(2, 6, " June ");
                        System.out.println(stringBuilder.toString());
                        break;
                    } else throw new DateExceptions();

                case 7:
                    stringBuilder.replace(2, 6, " July ");
                    System.out.println(stringBuilder.toString());
                    break;


                case 8:
                    stringBuilder.replace(2, 6, " August ");
                    System.out.println(stringBuilder.toString());
                    break;


                case 9:
                    if (day_number <= 30) {
                        stringBuilder.replace(2, 6, " September ");
                        System.out.println(stringBuilder.toString());
                        break;
                    } else throw new DateExceptions();


                case 11:
                    if (day_number <= 30) {
                        stringBuilder.replace(2, 6, " November ");
                        System.out.println(stringBuilder.toString());
                        break;
                    } else throw new DateExceptions();


                case 10:
                    stringBuilder.replace(2, 6, " October ");
                    System.out.println(stringBuilder.toString());
                    break;


                case 12:
                    stringBuilder.replace(2, 6, " December ");
                    System.out.println(stringBuilder.toString());
                    break;
            }
                              
        }
    }
}


