package com.example.randomfactsapi.services;

import com.example.randomfactsapi.model.Fact;
import com.example.randomfactsapi.repo.FactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Random;

@Service
public class FactServiceImpl implements FactService {
    @Autowired
    private FactRepository factRepository;

    private final Random random = new Random();

    @Override
    public Fact getRandomFact() {
        List<Fact> facts = factRepository.findAll();
        if (facts.isEmpty()) {
            return new Fact("No facts available! Add some using POST /facts.");
        }
        return facts.get(random.nextInt(facts.size()));
    }

    @Override
    public Fact addFact(Fact fact) {
        return factRepository.save(fact);
    }

    @Override
    public List<Fact> getAllFacts() {
        return factRepository.findAll();
    }
}
