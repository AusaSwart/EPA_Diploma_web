package com.epa.epadiplom.repositories;

import com.epa.epadiplom.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepo extends JpaRepository<Task, Long> {


}
