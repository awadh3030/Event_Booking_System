package com.codeline.Event_Booking_System.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Data
public class EventCreation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate date;
    private String location;
    private int ticketsAvailable;










}
