package com.eniac.backend.homework.services;

import com.eniac.backend.homework.domain.Inhabitant;
import com.eniac.backend.homework.repositories.InhabitantRespository;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InhabitantService {

    @Autowired
    private InhabitantRespository repo;

    public Inhabitant insert(Inhabitant obj) {
        return repo.save(obj);
    }

    public Inhabitant find(Integer id) {
        Optional<Inhabitant> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(1,"Object has not found"));
    }

    public List<Inhabitant> findAll() {
        return repo.findAll();
    }

    public Inhabitant update(Inhabitant obj) {
        return repo.save(obj);
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
