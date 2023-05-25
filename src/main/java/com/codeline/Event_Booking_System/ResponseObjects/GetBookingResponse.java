package com.codeline.Event_Booking_System.ResponseObjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetBookingResponse {

    String event;
    String location;
  //  LocalDate startDate;
    Integer numberOfTickets;
}
