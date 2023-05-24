package com.codeline.Event_Booking_System.Service;

import com.codeline.Event_Booking_System.Models.Event;
import com.codeline.Event_Booking_System.Repository.EventRepository;
import com.codeline.Event_Booking_System.ResponseObjects.GetEventResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class EventService {

@Autowired
EventRepository eventRepository;

@Autowired
GetEventResponse event;













    public GetEventResponse getEventById(Long eventtId) {
        Optional<Event> optionalEventSearch = eventRepository.findById(eventtId);
        if(!optionalEventSearch.isEmpty())
        {
            Event event =  optionalEventSearch.get();
            GetEventResponse eventResponse = new GetEventResponse(this.event.getLocation(), this.event.getStartDate(), this.event.getEventName());
            return eventResponse;
        }

        return null;

    }


}
