package com.example.randomfactsapi.controller;

import com.example.randomfactsapi.model.Fact;
import com.example.randomfactsapi.services.FactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/facts")
public class FactController {
    @Autowired
    private FactService factService;

    @GetMapping("/random")
    public ResponseEntity<String> getRandomFact() {
        return ResponseEntity.ok(factService.getRandomFact().getText());
    }

    @PostMapping
    public ResponseEntity<Fact> addFact(@RequestBody Fact fact) {
        return ResponseEntity.ok(factService.addFact(fact));
    }

    @GetMapping
    public ResponseEntity<List<Fact>> getAllFacts() {
        return ResponseEntity.ok(factService.getAllFacts());
    }
}

