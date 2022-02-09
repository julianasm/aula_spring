package com.example.aulaspring.repository;

import com.example.aulaspring.model.Cooperativa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CooperativaRepository extends JpaRepository<Cooperativa, Long> {
}
