package com.example.JeuxOlympiques.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventsService {

    private EventsRepository eventsRepository;
    @Autowired
    public EventsService (EventsRepository eventsRepository){
        this.eventsRepository = eventsRepository;
    }
    public List<Events> getAllEvents() {
        return eventsRepository.findAll();
    }
    public Events getEventById(Long id) {
        return eventsRepository.findById(id).orElse(null);
    }

    public Events createEvent(Events events) {
        return eventsRepository.save(events);
    }

}
