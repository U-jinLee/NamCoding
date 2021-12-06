package ch10;

import java.util.Calendar;

public class CalendarEx1 {
    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();

        System.out.println("This Year: "+today.get(Calendar.YEAR));
        System.out.println("This Month: "+today.get(Calendar.MONTH));
        System.out.println("Week's of Year: "+today.get(Calendar.WEEK_OF_YEAR));
    }
}
