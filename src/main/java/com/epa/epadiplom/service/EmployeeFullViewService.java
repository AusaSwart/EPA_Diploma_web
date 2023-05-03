package com.epa.epadiplom.service;

import com.epa.epadiplom.entity.EmployeeFullView;
import com.epa.epadiplom.repository.EmployeeFullViewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeFullViewService {

    private final EmployeeFullViewRepository employeeFullViewRepository;

    public List<EmployeeFullView> findAllByLoginUser(String loginUser){
        return employeeFullViewRepository.findAllByLoginUser(loginUser);
    }

}
