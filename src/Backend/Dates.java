package Backend;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Dates {
    
    private static String pattern = "dd-MM-yyyy";
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

    public Dates() {
    }

    public static String getCurrentDate() {
        String currentDate = simpleDateFormat.format(new Date());
        return currentDate;
    }

    public static String getExpiryDate() {

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, 30);
        String expiryDate = simpleDateFormat.format(calendar.getTime());
        return expiryDate;
    }

}
