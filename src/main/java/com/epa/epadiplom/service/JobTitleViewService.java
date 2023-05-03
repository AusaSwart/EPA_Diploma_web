package com.epa.epadiplom.service;

import com.epa.epadiplom.repository.JobTitleViewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JobTitleViewService {

    private final JobTitleViewRepository jobTitleViewRepository;


}
