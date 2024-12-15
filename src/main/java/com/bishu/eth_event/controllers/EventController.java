package com.bishu.eth_event.controllers;
import com.bishu.eth_event.dto.EventDTO;
import com.bishu.eth_event.entities.Event;
import com.bishu.eth_event.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/events")

public class EventController {

    private EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    // all events
//    @GetMapping("/")
//    public ResponseEntity<List<Event>> getAllEvents(){
//
//    }


    // single event
//    @GetMapping("/{id}")
//    public ResponseEntity<Event> getEventsById(@PathVariable int id){
//
//    }

    // update event
//    @PutMapping("/{id}")
//    public ResponseEntity<Event> updateEvents(@PathVariable int id, @RequestBody EventDTO entityDTO){
//
//    }

    // create events
    @PostMapping("/")
    public ResponseEntity<Event> createEvents(@RequestBody EventDTO eventDTO){
       Event event =  eventService.createEvent(eventDTO);
       return  ResponseEntity.ok(event);
    }


    // destroy events
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Event> destroyEvents(@PathVariable int id){
//
//    }

}