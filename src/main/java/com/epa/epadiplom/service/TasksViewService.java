package com.epa.epadiplom.service;

import com.epa.epadiplom.entity.TasksView;
import com.epa.epadiplom.repository.TasksViewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TasksViewService {
     private final TasksViewRepository tasksViewRepository;
    public List<TasksView> findAllByIdExecutor(long idLogin) {
        return tasksViewRepository.findAllByIdExecutor(idLogin);
    }
}
