package com.bishu.eth_event.repositories;

import com.bishu.eth_event.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Integer> {
}
