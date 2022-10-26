package Lesson10_collectionsJava;
import java.util.*;

/*
 * Для заданного текста (как ArrayList) text  построить множество встречающихся в нем слов (множество - это набор уникальных элементов)
 */

public class Task_2_getUniqueData {
    public static void main(String[] args) {


        String[] users = new String[]{"Wioletta", "Iga", "Halina", "Katarzyna", "Anna", "Anna",
                "Anna", "Katarzyna", "Halina", "Katarzyna", "Iga", "Wioletta", "Halina", "Wioletta",
                "Anna", "Iga", "Wioletta", "Anna", "Halina", "Iga", "Marek", "Halina",
                "Halina", "Wioletta", "Julian", "Iga", "Lidia", "Katarzyna", "Halina"};

        ArrayList<String> names = new ArrayList<>(Arrays.asList(users));
        getKeySet (names);
        printKeySet(getKeySet(names));
    }
    public static Set<String> getKeySet (ArrayList<String> names){
        Set<String> nameID = new HashSet<>();
        for (String name: names){
            nameID.add(name.toLowerCase());
            if (nameID.equals("")){
                nameID.remove(name);
            }
        }
        return nameID;
    }
    public static void printKeySet (Set<String> getKeySet){
        System.out.println(getKeySet);
    }
}
