package com.epa.epadiplom.service;

import com.epa.epadiplom.repository.PersonalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonalService {

    private final PersonalRepository personalRepository;
}
