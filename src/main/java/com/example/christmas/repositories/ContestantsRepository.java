package com.example.christmas.repositories;

import com.example.christmas.models.Contestant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContestantsRepository extends JpaRepository<Contestant, Long> {
}
