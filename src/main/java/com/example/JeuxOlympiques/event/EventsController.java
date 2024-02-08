package com.example.JeuxOlympiques.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/events")
public class EventsController {
    @Autowired
    private EventsService eventsService;
    @GetMapping
    public List<Events> getAllEvents() {
        return eventsService.getAllEvents();
    }

    @GetMapping("/{id}")
    public Events getEventById(@PathVariable Long id) {
        return eventsService.getEventById(id);
    }

    @PostMapping
    public Events createEvents(@RequestBody Events events) {
        return eventsService.createEvent(events);
    }

}
