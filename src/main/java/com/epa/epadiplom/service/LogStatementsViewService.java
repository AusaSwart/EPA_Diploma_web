package com.epa.epadiplom.service;

import com.epa.epadiplom.entity.LogStatementsView;
import com.epa.epadiplom.repository.LogStatementsViewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LogStatementsViewService {
    private final LogStatementsViewRepository logStatementsViewRepository;

    public List<LogStatementsView> findAllByIdApproverAndStatus(long idApprover, int status){
        return logStatementsViewRepository.findAllByIdApproverAndStatus(idApprover, status);
    }

}
