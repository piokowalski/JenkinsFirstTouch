package pl.stormit;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class GreeterFacade {


    @Inject
    TimeService timeService;


    public String time() {
        return timeService.time();
    }

}
