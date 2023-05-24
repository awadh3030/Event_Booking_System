package com.codeline.Event_Booking_System.Controller;

import com.codeline.Event_Booking_System.RequestObjects.GetEventRequestObject;
import com.codeline.Event_Booking_System.ResponseObjects.GetEventResponse;
import com.codeline.Event_Booking_System.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class EventController {


@Autowired
EventService eventService;



    @RequestMapping("employee/create")
    public void saveEmployee (@RequestBody GetEventRequestObject employeeRequestObject) {
        createEvent(employeeRequestObject);
    }

    @RequestMapping("event/get/{EventId}")
    public GetEventResponse createEventSearch (@PathVariable Long eventId) {
        return eventService.getEventById(eventId);
    }


    public void createEvent(GetEventRequestObject eventRequestObject) {

        Event event = new Event();
        event.seteventName(employeeRequestObject.getName());
        event.setticketsAvailable(100);
        event.setlocation("TechM");
        event.setstartDate(new Date());
        eventService.saveEvent(event);





    }
}












}
