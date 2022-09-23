
import java.util.Scanner;
public class Task_6 {
    public static void main (String[] args){
        System.out.println("Введи целое трёхзначное число");
        Scanner scanner_x = new Scanner (System.in);
        int x = scanner_x.nextInt();
        String str = Integer. toString(x);
        System.out.print(str.charAt(2));
        System.out.print(str.charAt(1));
        System.out.print(str.charAt(0));
    }
}
