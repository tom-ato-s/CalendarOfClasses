package Day;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;

class CalculationDeyOfWeek {

    public static String getStringDayOfWeek(LocalDate date3) {
        DayOfWeek dayOfWeek = date3.getDayOfWeek();
        System.out.println("dayOfWeek.toString()" + dayOfWeek.toString());
        return dayOfWeek.toString();
    }

    public static  LocalDate DayNow() {
        //   DateTimeFormatter mediumf = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        LocalDate date = LocalDate.now();
        //      mediumf.format(date);
        return date;
    }

    public static String getStringDayFormat(LocalDate date1) {
        DateTimeFormatter mediumf = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        String s = mediumf.format(date1).toString();
        return s;
    }

    public static String NowDayClass() {
        return getStringDayFormat(DayNow());
    }
    public static String NawWeek() {
        return getStringDayOfWeek(DayNow());
    }

}











 //       public LocalDate addDay(LocalDate date, 1) {
//            return date.plusDays(1);
//        }
//
//        public LocalDate subtractDay (LocalDate date){
//            return localDate.minusDays() Days(1);
//
//
//    }
