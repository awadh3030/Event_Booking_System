package com.codeline.Event_Booking_System.Repository;

import com.codeline.Event_Booking_System.Models.Booking;
import com.codeline.Event_Booking_System.Service.BookingService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

    //public static BookingRepository bookingRepository = null;
}
