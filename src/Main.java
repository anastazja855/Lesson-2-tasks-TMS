/**
 * Тривиальная (1 балл)
 *
 * Пользователь задает длину отрезка в саженях, аршинах и вершках (например, 8 саженей 2 аршина 11 вершков).
 * Определить длину того же отрезка в метрах (в данном случае 18.98).
 * 1 сажень = 3 аршина = 48 вершков, 1 вершок = 4.445 см.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Давай узнаем длину твоего отрезка в метрах:");
        double sazhen, arshin, vershok, result;
        final double unit=4.445/100;
        Scanner scanner_sazhen = new Scanner(System.in);
        System.out.print("Cколько саженей в твоем отрезке? ");
        sazhen = scanner_sazhen.nextDouble();
        System.out.print("Cколько аршинов в твоем отрезке? ");
        Scanner scanner_arshin = new Scanner(System.in);
        arshin = scanner_arshin.nextDouble();
        System.out.print("Cколько вершков в твоем отрезке? ");
        Scanner scanner_vershok = new Scanner(System.in);
        vershok = scanner_vershok.nextDouble();
        result=(vershok*unit)+(arshin*48*unit)+(sazhen*3*48*unit);
        System.out.println("Длина твоего отрезка " + sazhen +" саженей " + arshin +" аршинов " + vershok +" вершков\n");
        System.out.printf("Длина твоего отрезка в метрах равна:%.5f  ", result);

    }
}