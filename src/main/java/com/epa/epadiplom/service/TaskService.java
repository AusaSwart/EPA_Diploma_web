package com.epa.epadiplom.service;

import com.epa.epadiplom.entity.Event;
import com.epa.epadiplom.entity.Task;
import com.epa.epadiplom.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskService {

        private final TaskRepository taskRepository;

        public boolean saveTask (Task task){
                if(taskRepository.findById(task.getId()).isPresent())
                        return false;
                taskRepository.save(task);
                return true;
        }

}
