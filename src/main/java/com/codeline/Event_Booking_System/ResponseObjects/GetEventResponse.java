package com.codeline.Event_Booking_System.ResponseObjects;

import com.codeline.Event_Booking_System.Models.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetEventResponse extends BaseEntity {





    String location;
    LocalDate startDate;
    String eventName;
    int ticketsAvailable;



}
