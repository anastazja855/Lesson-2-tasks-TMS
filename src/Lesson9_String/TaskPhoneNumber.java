/**
 * Сложная (6 баллов)
 *
 * В строке представлено выражение вида "2 + 31 - 40 + 13",
 * использующее целые положительные числа, плюсы и минусы, разделённые пробелами.
 * Наличие двух знаков подряд "13 + + 10" или двух чисел подряд "1 2" не допускается.
 * Вернуть значение выражения (6 для примера).
 * Про нарушении формата входной строки бросить исключение IllegalArgumentException
 */
package Lesson9_String;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class TaskPhoneNumber {
    public static void main(String[] args) {
        String str = "2 + 31 - 40 + 13";
        StringBuilder stringBuilder = new StringBuilder(str);
        Pattern pattern = Pattern.compile("\\s*(\\s|\\-|\\+)\\s*");
        String[] numbers = pattern.split(str);
        int sum = 0;
        int [] number = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            number [i] = Integer.parseInt(numbers[i]);
        }
        for (int y = 0; y < number.length; y++) {
            int x=number[y]+sum;
            sum=x;
        }
        System.out.println(sum);
    }
}