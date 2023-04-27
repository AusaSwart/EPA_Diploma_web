package com.epa.epadiplom.service;

import com.epa.epadiplom.entity.EventsView;
import com.epa.epadiplom.repository.EventsViewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EventsViewService {
    private final EventsViewRepository eventsViewRepository;

    public List<EventsView> findAllByIdRecipient(long idLogin) {
        return eventsViewRepository.findAllByIdRecipient(idLogin);
    }

}
