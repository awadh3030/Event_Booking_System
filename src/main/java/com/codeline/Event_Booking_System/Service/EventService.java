package com.codeline.Event_Booking_System.Service;

import com.codeline.Event_Booking_System.Models.BaseEntity;
import com.codeline.Event_Booking_System.Models.Event;
import com.codeline.Event_Booking_System.Repository.EventRepository;
import com.codeline.Event_Booking_System.ResponseObjects.GetEventResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class EventService extends BaseEntity {

@Autowired
EventRepository eventRepository;

@Autowired
GetEventResponse event;








    public void saveEvent(Event event) {eventRepository.save(event);}


    public GetEventResponse getEventById(Long eventId) {
        Optional<Event> optionalEventSearch = eventRepository.findById(eventId);
        if(!optionalEventSearch.isEmpty())
        {
            Event event =  optionalEventSearch.get();
            GetEventResponse eventResponse = new GetEventResponse(event.getLocation(), event.getStartDate(), event.getEventName(),event.getTicketsAvailable());
            return eventResponse;
        }

        return null;

    }


}
