package Lesson9_String;

import Lesson9_String.customExceptions.DateExceptions;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.regex.Pattern;

public class TaskDate {

    public static void main(String[] args) throws DateExceptions {
        String userDate = "15 July 2016";
        StringBuilder m = new StringBuilder(userDate);
        Pattern pattern = Pattern.compile("\\.|\\s");
        String[] date = pattern.split(userDate);
        int days = Integer.parseInt(date [0]);
        if (days > 31) {
            throw new DateExceptions();
        }
        else {
            for (String dates : date)
                System.out.print(dates + " ");

            String[] monthName = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
            String[] monthNumber = new String[]{"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};

            String monthNumberUser = date[1].toString();

            for (int y = 0; y < monthNumber.length; y++) {
                int k = y;
                if (monthNumberUser.equals(monthName[y])) {
                    System.out.println(date[0].toString() + "." + monthNumber[k].toString() + "." + date[2].toString());
                } else {
                    System.out.print(" ");
                }


            }


            getMonthName(userDate);
        }
}
        //replaceMonthName (stringBuilder);

    public static @NotNull String getMonthName (String userDate){
        int x=userDate.length()-5;
        int monthNameLength = userDate.length()-8;
        char [] month = new char[monthNameLength];
        userDate.getChars(3,x,month, 0);
        String myMonth = new String(month);
        return myMonth;
    }

    /*
    public static void printMonth (String[] date, String [] monthNumber){
        String monthNumberUser=date[1].toString();

        for (int i = 0; i < monthNumber.length; i++) {
            if (monthNumberUser.equals(monthNumber[i])) {
                System.out.println(date[0].toString() + monthNumber[i].toString() + date[2].toString());}
        }

    }
    */
    }
    /*public static void replaceMonthName (@NotNull StringBuilder stringBuilder){
        switch (Objects.requireNonNull(stringBuilder)) {
            case StringBuilder july = new StringBuilder("July");
        }

    }
*/


