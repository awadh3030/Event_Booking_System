package com.codeline.Event_Booking_System.Repository;

import com.codeline.Event_Booking_System.Models.EventCreation;
import com.codeline.Event_Booking_System.Models.EventSearch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventSearchRepository extends JpaRepository<EventSearch, Long> {
}
