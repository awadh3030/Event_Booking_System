package com.codeline.Event_Booking_System.RequestObjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetBookingRequestObjects {
    String event;
    String location;
    LocalDate startDate;
    int numberOfTickets;
}
