package Lesson9_String.customExceptions;

public class DateExceptions extends Exception {
    private String dayException;

    public DateExceptions () {
        dayException = "Your date is wrong. Your month has less days, than you specified";
    }
    public void getDateExceptions (){
        System.out.println(dayException);
    }
    }

