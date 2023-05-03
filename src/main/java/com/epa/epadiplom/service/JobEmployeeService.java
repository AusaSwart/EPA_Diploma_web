package com.epa.epadiplom.service;

import com.epa.epadiplom.repository.JobEmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JobEmployeeService {

    private  final JobEmployeeRepository jobEmployeeRepository;



}
