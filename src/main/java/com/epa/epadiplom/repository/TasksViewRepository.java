package com.epa.epadiplom.repository;

import com.epa.epadiplom.entity.TasksView;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface TasksViewRepository extends JpaRepository<TasksView, Long> {

    List<TasksView> findAllByIdExecutor(long idLogin);

}
