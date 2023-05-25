package com.codeline.Event_Booking_System.Controller;

import com.codeline.Event_Booking_System.Models.BaseEntity;
import com.codeline.Event_Booking_System.Models.Booking;
import com.codeline.Event_Booking_System.Service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@RestController
public class BookingController extends BaseEntity {
    @Autowired
    BookingService bookingService ;

    @RequestMapping("api/booking")
    public List<Booking> getBooking() {
        return bookingService.getBooking();
    }


    public void createBooking() {

        Booking booking = new Booking();

        booking.setNumberOfTickets(1000);
        booking.setEvent("OMR");
        booking.setLocation("OMR");
        booking.setStartDate(new Date());
        bookingService.saveBooking(booking);



//        @RequestMapping("DELETE /api/bookings/{bookingId}") public void deleteebooking (@PathVariable Long Id) {
//            bookingService.deleteBookingById(Id);
//        }

    }
}