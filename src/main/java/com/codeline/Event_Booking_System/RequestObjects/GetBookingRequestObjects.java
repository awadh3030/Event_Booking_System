package com.codeline.Event_Booking_System.RequestObjects;

import java.time.LocalDate;

public class GetBookingRequestObjects {
    String event;
    String location;
    LocalDate startDate;
    int numberOfTickets;
}