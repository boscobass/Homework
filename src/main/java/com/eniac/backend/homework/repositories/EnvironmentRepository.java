package com.eniac.backend.homework.repositories;

import com.eniac.backend.homework.domain.Environment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnvironmentRepository extends JpaRepository<Environment, Integer> {
}
