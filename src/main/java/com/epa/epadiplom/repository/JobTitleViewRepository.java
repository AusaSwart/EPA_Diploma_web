package com.epa.epadiplom.repository;

import com.epa.epadiplom.entity.JobTitleView;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface JobTitleViewRepository extends JpaRepository<JobTitleView, Long> {


}
