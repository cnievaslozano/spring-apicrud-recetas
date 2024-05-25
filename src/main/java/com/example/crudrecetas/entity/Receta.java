package com.example.crudrecetas.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
@Table(name = "tbl_receta")
public class Receta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recetaId;
    private String nombre;
    private List<String> ingredientes;
    @Lob
    private String instrucciones;

    private String categoria;

    private int tiempoPreparacion; // en minutos

    private int porciones;

    private String dificultad;

    private String imagenUrl;
}
