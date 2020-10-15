package com.eniac.backend.homework.repositories;

import com.eniac.backend.homework.domain.Inhabitant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InhabitantRespository extends JpaRepository<Inhabitant, Integer> {
}
