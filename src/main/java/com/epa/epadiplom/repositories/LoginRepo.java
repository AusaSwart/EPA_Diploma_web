package com.epa.epadiplom.repositories;

import com.epa.epadiplom.entities.Login;
import org.springframework.data.repository.CrudRepository;

public interface LoginRepo extends CrudRepository<Login, Long> {
}
