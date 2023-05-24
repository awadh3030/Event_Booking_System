package com.codeline.Event_Booking_System.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
@Data
public class Booking {

    Long eventId;
   Long userId;
     int numberOfTickets;
}
