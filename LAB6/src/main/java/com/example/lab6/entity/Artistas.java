package com.example.lab6.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name="artistas")
@Data
public class Artistas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "artistaId", nullable = false)
    private int artistaId;

    @Size(max=100)
    @NotNull
    @Column(name="nombre")
    private String nombre;


    @Size(max=50)
    @Column(name="genero")
    private String genero;


    @Size(max=9)
    @Column(name="telefono")
    private String telefono;
}
