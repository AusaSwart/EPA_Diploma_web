package com.epa.epadiplom.service;

import com.epa.epadiplom.entity.LogStatement;
import com.epa.epadiplom.repository.LogStatementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LogStatementService {

    private final LogStatementRepository logStatementRepository;
    public void saveLogStatement(LogStatement logStatement) {
        if(logStatementRepository.findById(logStatement.getId()).isPresent())
            return;
        logStatementRepository.save(logStatement);
    }

    public Optional<LogStatement> findByIdAndIdApprover (long id, long idApprover){
        return logStatementRepository.findByIdAndIdApprover(id, idApprover);
    }

}
