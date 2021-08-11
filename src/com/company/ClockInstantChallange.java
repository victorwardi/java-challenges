package com.company;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;

public class ClockInstantChallange {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime: " + localDateTime);
        System.out.println();

        Instant instantNow = Instant.now();
        System.out.println("instantNow: " + instantNow);
        System.out.println();

        Clock clock = Clock.systemDefaultZone();
        Instant instantDefaultZone = clock.instant();
        System.out.println("instantDefaultZone: " + instantDefaultZone);
        System.out.println();

        Clock clockUTC = Clock.systemUTC();
        Instant instantUTC = clockUTC.instant();
        System.out.println("instantUTC: " + instantUTC);

    }
}
