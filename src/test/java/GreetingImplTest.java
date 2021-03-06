import com.home.ivan.GreetingImpl;
import org.junit.Test;

import java.util.Date;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GreetingImplTest {

  @Test
  public void testGetDaytime() throws Exception {
    GreetingImpl greeting = new GreetingImpl();

    Date nightDate = new Date();
    nightDate.setHours(4);
    String greetingNightDaytime = greeting.getDaytime(nightDate);
    assertThat(greetingNightDaytime, is(equalTo("night")));

    Date dayDate = new Date();
    dayDate.setHours(7);
    String greetingDayDaytime = greeting.getDaytime(dayDate);
    assertThat(greetingDayDaytime, is(equalTo("day")));
  }
}