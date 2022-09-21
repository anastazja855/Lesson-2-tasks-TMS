/**
 * Тривиальная (1 балл)
 *
 * Найти длину отрезка, соединяющего точки на плоскости с координатами (x1, y1) и (x2, y2).
 * Например, расстояние между (3, 0) и (0, 4) равно 5
 */

import java.util.Scanner;
public class Task_2 {
    public static void main (String[] args) {
        System.out.println("Найдем длину отрезка, соединяющего точки на плоскости с координатами (x1, y1) и (x2, y2)");
        double x1, x2, y1, y2, result;
        Scanner scanner_x1=new Scanner(System.in);
        System.out.println("Введи координаты первой точки");
        System.out.println("Координата первой точки по оси X = ");
        x1=scanner_x1.nextDouble();
        Scanner scanner_y1=new Scanner(System.in);
        System.out.println("Кордината первой точки по оси Y = ");
        y1=scanner_y1.nextDouble();
        System.out.println("Введи координаты второй точки");
        System.out.println("Координата второй точки по оси X = ");
        Scanner scanner_x2=new Scanner(System.in);
        x2=scanner_x2.nextDouble();
        Scanner scanner_y2=new Scanner(System.in);
        System.out.println("Координата первой точки по оси Y = ");
        y2=scanner_y2.nextDouble();
        result=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println("Длина отрезка равна = " + result);

    }
}
