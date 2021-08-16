package cleanTest;


import activities.Alarm;
import activities.AppClock;
import activities.BedTime;
import activities.Sleep;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

import java.net.MalformedURLException;

public class ClockTest {

    AppClock clock = new AppClock();
    BedTime bedTime = new BedTime();
    Alarm alarm = new Alarm();
    Sleep sleep = new Sleep();

    @Test
    public void testClock() throws MalformedURLException {
        clock.buttonAdd.click();
        bedTime.buttonStart.click();
        alarm.buttonLess.click();alarm.buttonLess.click();
        alarm.buttonDaySaturday.click();alarm.buttonDaySunday.click();
        alarm.buttonNext.click();
        sleep.buttonDone.click();
        boolean isPresent = sleep.buttonProgram.isPresent();
        Assertions.assertTrue(isPresent);
    }

    @AfterEach
    public void close() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
