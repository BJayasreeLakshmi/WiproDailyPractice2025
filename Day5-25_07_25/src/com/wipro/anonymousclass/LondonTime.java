package com.wipro.anonymousclass;



import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.function.Consumer;

public class LondonTime {

    public static void main(String[] args) {
        
        Consumer<String> c = zoneName -> {
            ZonedDateTime currentTime = ZonedDateTime.now(ZoneId.of(zoneName));
            System.out.println("Current time at " + zoneName + " is " + currentTime);
        };

        c.accept("Europe/London");
    }
}
