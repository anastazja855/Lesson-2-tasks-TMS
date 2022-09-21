/**
 * Простая (2 балла)
 *
 * Определить, четное ли данное число
 *
 */
import java.util.Scanner;
public class Task_3 {
    public static void main (String[] args) {
        double x, result;
        System.out.println("Введи своё число");
        Scanner scanner_x=new Scanner(System.in);
        x=scanner_x.nextDouble();
        result= x%2;
        if (result==0)
            System.out.println("Число "+ x+ " чётное");
        else
            System.out.println("Число "+ x+ " нечётное");

    }
}
