package com.codeline.Event_Booking_System.Service;

import com.codeline.Event_Booking_System.Models.Booking;
import com.codeline.Event_Booking_System.Models.UserRegistration;
import com.codeline.Event_Booking_System.Repository.BookingRepository;
import com.codeline.Event_Booking_System.ResponseObjects.GetBookingResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.codeline.Event_Booking_System.Repository.BookingRepository.bookingRepository;

@Service
public class BookingService {


    public static BookingService bookingService;
//    @Autowired
//    BookingRepository bookingRepository;


//    @Autowired
//    GetBookingResponse booking;


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

