package com.codeline.Event_Booking_System.Repository;

import com.codeline.Event_Booking_System.Models.EventCreation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventCreationRepository extends JpaRepository<EventCreation, Long> {
}
