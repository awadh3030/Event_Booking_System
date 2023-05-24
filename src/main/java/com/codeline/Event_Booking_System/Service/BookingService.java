package com.codeline.Event_Booking_System.Service;

import com.codeline.Event_Booking_System.Models.Booking;
import org.springframework.stereotype.Service;

@Service
public class BookingService {


    public List<Booking> getBooking() {
        return bookingRepository.findAll();
    }
}
