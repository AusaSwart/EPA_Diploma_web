package com.epa.epadiplom.service;

import com.epa.epadiplom.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskService {
        private final TaskRepository taskRepository;

}
