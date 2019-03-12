import java.sql.SQLOutput;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateCalendar {

    static int Proba;


    public static void main(String[] args) throws Exception {

//Date date1 = new Date("1990/04/15");
//Date date2 = new Date("15/04/1990");
//
//
//SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH);
//        System.out.println(simpleDateFormat.format(date2));
//
//
//
//
//        final String OLD_FORMAT = "dd/MM/yyyy";
//        final String NEW_FORMAT = "yyyy/MM/dd";

// August 12, 2010
        Date date = new Date();

        String newDateString;

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Date d = sdf.parse("15/04/1990");






    }
}


