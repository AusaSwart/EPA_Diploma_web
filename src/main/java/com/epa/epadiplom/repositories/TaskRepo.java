package com.epa.epadiplom.repositories;

import com.epa.epadiplom.entities.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepo extends CrudRepository <Task, Long> {
}
