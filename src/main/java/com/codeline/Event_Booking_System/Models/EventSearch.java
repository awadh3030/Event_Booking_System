package com.codeline.Event_Booking_System.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.time.LocalDate;
@Getter
@Setter
@Entity
@Data
public class EventSearch {
     String location;
     LocalDate startDate;
     LocalDate endDate;
     String eventName;
}
