package com.example.lab6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.lab6.entity.Eventos;

@Repository
public interface EventoRepository extends JpaRepository<Eventos, Integer> {
}
