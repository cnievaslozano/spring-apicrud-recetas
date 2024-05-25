package com.example.crudrecetas.service;

import com.example.crudrecetas.entity.Receta;
import com.example.crudrecetas.repository.RecetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class RecetaService {
    @Autowired
    RecetaRepository recetaRepository;

    public List<Receta> getRecetas(){

        return recetaRepository.findAll();
    }

    public Optional<Receta> getReceta(Long id){

        return recetaRepository.findById(id);
    }

    public void saveOrUpdate(Receta receta) {
        recetaRepository.save(receta);
    }

    public void delete(Long id) {
        recetaRepository.deleteById(id);
    }
}
