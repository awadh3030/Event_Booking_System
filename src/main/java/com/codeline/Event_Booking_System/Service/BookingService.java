package com.codeline.Event_Booking_System.Service;

import com.codeline.Event_Booking_System.Models.Booking;
import com.codeline.Event_Booking_System.Models.UserRegistration;
import com.codeline.Event_Booking_System.Repository.BookingRepository;
import com.codeline.Event_Booking_System.ResponseObjects.GetBookingResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {


    @Autowired
    BookingRepository bookingRepository;


    @Autowired
    GetBookingResponse booking;


    public List<Booking> getBooking() {
        return bookingRepository.findAll();
    }

        public void saveBooking (Booking booking){
            bookingRepository.save(booking);
        }


        public void deleteBookingById (Long bookingId){
            bookingRepository.deleteById(bookingId);
        }


    }

