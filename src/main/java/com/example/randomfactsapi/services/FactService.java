package com.example.randomfactsapi.services;

import com.example.randomfactsapi.model.Fact;
import java.util.List;

public interface FactService {
    Fact getRandomFact();
    Fact addFact(Fact fact);
    List<Fact> getAllFacts();
}
