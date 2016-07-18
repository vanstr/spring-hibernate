import java.util.Date;

public class Greeting {

  public String getDaytime(Date date) {
    long hour = date.getHours();
    if(hour >= 6L && hour < 24L ) {
      return "day";
    }else{
      return "night";
    }
  }
}
