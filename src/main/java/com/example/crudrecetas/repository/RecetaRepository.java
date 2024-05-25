package com.example.crudrecetas.repository;

import com.example.crudrecetas.entity.Receta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecetaRepository extends JpaRepository<Receta, Long> {



}
