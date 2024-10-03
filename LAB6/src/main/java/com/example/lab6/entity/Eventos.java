package com.example.lab6.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Data
@Entity
@Table(name="eventos")
public class Eventos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="eventoId", nullable=false)
    private Integer id;

    @Size(max=100)
    @NotNull
    @Column(name="nombre")
    private String nombre;

    @Column(name="fecha")
    private LocalDate fecha;

    @Column(name="asistentesEsperados")
    private Integer asistentes;
}
