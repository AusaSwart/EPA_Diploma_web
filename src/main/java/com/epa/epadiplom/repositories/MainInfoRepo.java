package com.epa.epadiplom.repositories;

import com.epa.epadiplom.entities.MainInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MainInfoRepo
        extends JpaRepository<MainInfo, Long> {
    // Here we're writing more complicated methods for BD for MainInfo table
    // Also connect w/ standard methods

}
