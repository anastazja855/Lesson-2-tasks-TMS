package Lesson10_collectionsJava;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/*
 * Найти в заданном списке (ArrayList) повторяющиеся элементы и вернуть
 * ассоциативный массив с информацией о числе повторений
 * для каждого повторяющегося элемента.
 * Если элемент встречается только один раз, включать его в результат
 * не следует.
 */

public class Tasks_Collection {
    public static void main(String[] args) {


        String[] users = new String[]{"Wioletta", "Iga", "Janusz", "Ewa", "Anna", "Sebastian", "Dariusz", "Tomasz", "Wasyl", "Paweł", "Marcin", "Dariusz", "Andrzej", "Anna",
                "Marek", "Mirosław", "Przemysław", "Wiesława", "Mateusz", "Barbara", "Anna", "Katarzyna", "Sławomir", "Krzysztof", "Maciej", "Mirosław", "Agnieszka", "Ewa",
                "Jakub", "Katarzyna", "Anna", "Maria", "Wiesław", "Daria", "Agnieszka", "Mariusz", "Mariusz", "Zbigniew", "Marek", "Anna", "Grzegorz", "Dawid", "Marek", "Andrzej",
                "Marcin", "Paweł", "Julian", "Marlena", "Lidia", "Katarzyna", "Halina"};

        ArrayList<String> names = new ArrayList<>(Arrays.asList(users));
        countNameQuantity(names);
        printDuplicate (countNameQuantity(names));
    }


    public static HashMap countNameQuantity(ArrayList<String> names) {
        HashMap<String, Integer> namesQuantity = new HashMap<>();
        for (int i = 0; i < names.size(); i++) {
            int quantityName = 1;
            if (!namesQuantity.containsKey(names.get(i))) {
                for (int j = i + 1; j < names.size(); j++) {
                    if (names.get(i).equals(names.get(j))) {
                        quantityName++;
                    }
                }


                if (quantityName > 1) {
                    namesQuantity.put(names.get(i), quantityName);
                }
            }

        }
        return namesQuantity;
    }

    public static void printDuplicate (HashMap countNameQuantity){
        System.out.println(countNameQuantity);
    }
}






