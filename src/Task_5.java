/**
 * Простая (2 балла)
 *
 * Пользователь задает целое число, больше или равно 100 (например, 3801).
 * Определить третью цифру справа в этом числе (в данном случае 8).
 */

import java.util.Scanner;
public class Task_5 {
    public static void main (String[] args) {
        System.out.println("Введи число больше или равно 100");
        Scanner scanner_x=new Scanner(System.in);
        int x=scanner_x.nextInt();
        String str = Integer. toString(x);
        int length=str.length();
        int pos_3=length-3;
        char n_3=str.charAt(pos_3);

        System.out.println("Третья цифра справа это " + n_3);

    }
}
