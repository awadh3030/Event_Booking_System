package com.codeline.Event_Booking_System.RequestObjects;

import com.codeline.Event_Booking_System.Models.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetEventRequestObjects extends BaseEntity {
    String location;
    LocalDate startDate;


    String eventName;
    int ticketsAvailable;
}
