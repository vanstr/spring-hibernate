package com.home.ivan;

import java.util.Date;

public class GreetingImpl implements Greeting{

  public String getDaytime(Date date) {
    long hour = date.getHours();
    if(hour >= 6L && hour < 24L ) {
      return "day";
    }else{
      return "night";
    }
  }
}
