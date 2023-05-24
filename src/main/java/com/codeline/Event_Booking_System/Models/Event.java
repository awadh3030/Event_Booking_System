package com.codeline.Event_Booking_System.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@Entity
@Data
public class Event {
     @Id
     @GeneratedValue(strategy = GenerationType.SEQUENCE)
     Long id;

     String location;
    Date startDate;
     LocalDate endDate;
     String eventName;
     int ticketsAvailable;

}
