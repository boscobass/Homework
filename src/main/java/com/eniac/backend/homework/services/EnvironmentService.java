package com.eniac.backend.homework.services;

import com.eniac.backend.homework.domain.Environment;
import com.eniac.backend.homework.domain.Inhabitant;
import com.eniac.backend.homework.repositories.EnvironmentRepository;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnvironmentService {

    @Autowired
    private EnvironmentRepository repo;

    public Environment insert(Environment obj) {
        return repo.save(obj);
    }

    public Environment find(Integer id) {
        Optional<Environment> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(1,"Object has not found"));
    }

    public List<Environment> findAll() {
        return repo.findAll();
    }

    public Environment update(Environment obj) {
        return repo.save(obj);
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
