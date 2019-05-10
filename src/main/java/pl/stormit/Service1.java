package pl.stormit;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Service1 {
    public static void main(String[] args) {


        DateFormat dateFormat = new SimpleDateFormat();

        Date date = new Date(2019, 1, 10);

        String formattedDate = dateFormat.format(date);

        System.out.println(formattedDate);
    }


}


