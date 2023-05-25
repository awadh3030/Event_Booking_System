package com.codeline.Event_Booking_System.Controller;

import com.codeline.Event_Booking_System.Models.BaseEntity;
import com.codeline.Event_Booking_System.Models.Booking;
import com.codeline.Event_Booking_System.RequestObjects.GetBookingRequestObjects;
import com.codeline.Event_Booking_System.Service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import static com.codeline.Event_Booking_System.Service.BookingService.bookingService;

@RestController
public class BookingController extends BaseEntity {
  @Autowired
    BookingService bookingService ;

    @RequestMapping("api/booking")
    public List<Booking> getBooking() {
        return bookingService.getBooking();
    }

    @RequestMapping("api/booking/Tickets")
    public void saveBooking(@RequestBody GetBookingRequestObjects bookingRequestObjects){
            createBooking(bookingRequestObjects);
    }


    public void createBooking(GetBookingRequestObjects bookingRequestObjects) {

        Booking booking = new Booking();
        booking.setNumberOfTickets(bookingRequestObjects.getNumberOfTickets());
        booking.setEvent("OMR");
        booking.setLocation("OMR");
        booking.setStartDate(new Date());
        bookingService.saveBooking(booking);

    }

       @RequestMapping("api/bookings/{Id}") public void deletebooking (@PathVariable Long Id) {
            bookingService.deleteBookingById(Id);
        }


}