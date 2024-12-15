package com.bishu.eth_event.services;

import com.bishu.eth_event.dto.EventDTO;
import com.bishu.eth_event.entities.Event;
import org.springframework.stereotype.Service;


public interface EventService {
    Event createEvent(EventDTO eventDTO);
}
