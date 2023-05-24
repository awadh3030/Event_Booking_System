package com.codeline.Event_Booking_System.Controller;

import com.codeline.Event_Booking_System.Models.BaseEntity;
import com.codeline.Event_Booking_System.Models.Event;
import com.codeline.Event_Booking_System.RequestObjects.GetEventRequestObject;
import com.codeline.Event_Booking_System.ResponseObjects.GetEventResponse;
import com.codeline.Event_Booking_System.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Date;

@RestController
public class EventController extends BaseEntity {


@Autowired
EventService eventService;



    @RequestMapping("event/create")
    public void saveEmployee (@RequestBody GetEventRequestObject employeeRequestObject) {
        createEvent(employeeRequestObject);
    }

    @RequestMapping("event/get/{EventId}")
    public GetEventResponse createEventSearch (@PathVariable Long eventId) {
        return eventService.getEventById(eventId);
    }


    public void createEvent(GetEventRequestObject eventRequestObject) {

        Event event = new Event();
        event.setEventName(eventRequestObject.getEventName());
        event.setTicketsAvailable(eventRequestObject.getTicketsAvailable());
        event.setLocation(eventRequestObject.getLocation());
        event.setStartDate(new Date());
        eventService.saveEvent(event);





    }
}













