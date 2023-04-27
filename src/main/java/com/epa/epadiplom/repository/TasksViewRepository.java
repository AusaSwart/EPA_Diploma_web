package com.epa.epadiplom.repository;

import com.epa.epadiplom.entity.TasksView;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface TasksViewRepository extends JpaRepository<TasksView, Long> {

}
