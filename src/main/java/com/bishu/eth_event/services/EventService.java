package com.bishu.eth_event.services;

import com.bishu.eth_event.dto.EventDTO;
import com.bishu.eth_event.entities.Event;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EventService {
    Event createEvent(EventDTO eventDTO);
    List<EventDTO> allEvents();
    EventDTO getEventById(int id);
    EventDTO updateEvent(EventDTO eventDTO, int id);
}
