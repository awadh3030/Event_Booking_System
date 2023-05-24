package com.codeline.Event_Booking_System.Controller;

import com.codeline.Event_Booking_System.ResponseObjects.GetEventResponse;
import com.codeline.Event_Booking_System.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {


@Autowired
EventService eventService;


    @RequestMapping("event/get/{EventId}")
    public GetEventResponse createEventSearch (@PathVariable Long eventId) {
        return eventService.getEventById(eventId);
    }

}
