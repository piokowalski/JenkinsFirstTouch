package pl.stormit;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Service1 {
    public static void main(String[] args) {


        //Example1
        DateFormat dateFormat = new SimpleDateFormat();

        Date date = new Date(2019, 1, 10);

        String formattedDate = dateFormat.format(date);

        System.out.println(formattedDate);

        //Example2
        int a = 2_147_483_646;
        int b = 1;
        int result = a + b;

        System.out.println(result);
    }


}


