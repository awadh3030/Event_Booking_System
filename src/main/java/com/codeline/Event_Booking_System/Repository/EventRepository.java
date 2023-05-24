package com.codeline.Event_Booking_System.Repository;

import com.codeline.Event_Booking_System.Models.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {



}
