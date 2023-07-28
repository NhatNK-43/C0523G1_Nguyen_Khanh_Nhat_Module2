package case_study.common;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class CheckDate {
    static final String REGEX_DATE = "^\\d{2}/\\d{2}/\\d{4}";
    public static Date checkDate(String dateString){
        Date date = null;
        try {
            date = new SimpleDateFormat("dd/MM/yyyy").parse(dateString);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
       // dateString = DateFormat.getDateInstance().format(date);
        return date;
    }
}
