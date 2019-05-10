package pl.stormit;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Stateless
public class TimeService {

    public String time() {
        return Long.toString(System.currentTimeMillis());
    }

    @PostConstruct
    public void init() {
        System.out.println("Logged here");
    }
}
