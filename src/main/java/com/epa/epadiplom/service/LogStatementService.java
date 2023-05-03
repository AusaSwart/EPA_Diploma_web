package com.epa.epadiplom.service;

import com.epa.epadiplom.entity.LogStatement;
import com.epa.epadiplom.repository.LogStatementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogStatementService {

    private final LogStatementRepository logStatementRepository;

    //public LogStatement

}
