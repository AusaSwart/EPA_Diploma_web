package com.epa.epadiplom.service;

import com.epa.epadiplom.entity.Event;
import com.epa.epadiplom.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EventService {

    private final EventRepository eventRepository;

    public boolean saveEvent (Event event){
        eventRepository.save(event);
    }

}
