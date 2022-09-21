/**
 * Простая (2 балла)
 *
 * Поезд вышел со станции отправления в h1 часов m1 минут (например в 9:25) и
 * прибыл на станцию назначения в h2 часов m2 минут того же дня (например в 13:01).
 * Определите время поезда в пути в минутах (в данном случае 216).
 */

import java.util.Scanner;

public class Task_4 {
    public static void main (String[] args) {
        double departure_minute, arrival_minute, departure_hours, arrival_hours, result;
        System.out.println("Определим время поезда в пути в минутах");

        System.out.println("Введите время отправления поезда");
        Scanner departure_hours_scanner=new Scanner(System.in);
        System.out.print("Введите час отправления поезда: ");
        departure_hours=departure_hours_scanner.nextDouble();
        System.out.print ("Введите минуту отправления поезда: ");
        Scanner departure_minute_scanner=new Scanner(System.in);
        departure_minute=departure_minute_scanner.nextDouble();

        System.out.println("Введите час прибытия поезда: ");
        Scanner arrival_hours_scanner = new Scanner(System.in);
        arrival_hours=arrival_hours_scanner.nextDouble();

        System.out.print ("Введите минуту прибытия поезда: ");
        Scanner arrival_minute_scanner=new Scanner(System.in);
        arrival_minute=arrival_minute_scanner.nextDouble();

        double travel_minute=arrival_minute-departure_minute;
        double travel_hors=arrival_hours-departure_hours;
        result=travel_minute+travel_hors*60;
        System.out.println("Время поезда в пути составило " + result + " минут");


    }
}
