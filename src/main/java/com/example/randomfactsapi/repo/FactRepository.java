package com.example.randomfactsapi.repo;
import com.example.randomfactsapi.model.Fact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface FactRepository extends JpaRepository<Fact, Long> {

    }

