package com.example.lab6.repository;

import com.example.lab6.entity.Artistas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistaRepository extends JpaRepository<Artistas, Integer> {
}
