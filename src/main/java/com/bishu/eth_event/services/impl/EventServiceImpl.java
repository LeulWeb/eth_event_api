package com.bishu.eth_event.services.impl;

import com.bishu.eth_event.dto.EventDTO;
import com.bishu.eth_event.entities.Event;
import com.bishu.eth_event.repositories.EventRepository;
import com.bishu.eth_event.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EventServiceImpl implements EventService {

    private EventRepository eventRepository;

    @Autowired
    public EventServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public Event createEvent(EventDTO eventDTO){
        Event event = mapFromDTO(eventDTO);
        Event addedEvent = eventRepository.save(event);
        return  addedEvent;
    }

    @Override
    public List<EventDTO> allEvents(){
        List<Event> eventList =  eventRepository.findAll();
        return eventList.stream().map(e -> mapToDTO(e)).collect(Collectors.toList());
    }

    @Override
    public EventDTO getEventById(int id){
        //TODO: make this to handle exception
        Event event = eventRepository.findById(id).orElse(new Event());
        return  mapToDTO(event);
    }

    @Override
    public EventDTO updateEvent(EventDTO eventDTO, int id){
        // TODO: handle exception in here
        Event event = eventRepository.findById(id).orElse(new Event());

        event.setTitle(eventDTO.getTitle());
        event.setDescription(eventDTO.getDescription());
        event.setThumbnail(eventDTO.getThumbnail());
        event.setStart_date(eventDTO.getStart_date());
        event.setEnd_date(eventDTO.getEnd_date());
        event.setUpdated_date(new Date());

        Event updatedEvent =  eventRepository.save(event);
        return  mapToDTO(updatedEvent);

    }



    private EventDTO mapToDTO(Event event){
        EventDTO eventDTO = new EventDTO();
        eventDTO.setId(event.getId());
        eventDTO.setTitle(event.getTitle());
        eventDTO.setDescription(event.getDescription());
        eventDTO.setThumbnail(event.getThumbnail());
        eventDTO.setStart_date(event.getStart_date());
        eventDTO.setEnd_date(event.getEnd_date());
        return  eventDTO;
    }

    private  Event mapFromDTO(EventDTO eventDTO){
        Event event = new Event();
        event.setId(eventDTO.getId());
        event.setTitle(eventDTO.getTitle());
        event.setDescription(eventDTO.getDescription());
        event.setStart_date(eventDTO.getStart_date());
        event.setEnd_date(eventDTO.getEnd_date());
        event.setCreated_date(new Date());
        event.setUpdated_date(new Date());

        return   event;
    }

}
