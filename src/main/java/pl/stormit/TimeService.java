package pl.stormit;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeService {

    DateFormat dateFormat = new SimpleDateFormat();

    Date date = new Date(2019,5,10);

    String formattedDate = dateFormat.format(date);
}
