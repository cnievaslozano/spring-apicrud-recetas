package com.example.crudrecetas.controller;

import com.example.crudrecetas.entity.Receta;
import com.example.crudrecetas.service.RecetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/recetas")
public class RecetaController {

    @Autowired
    private RecetaService recetaService;

    // READ ALL
    @GetMapping
    public List<Receta> getAll(){
        return recetaService.getRecetas();
    }

    // READ ONE
    @GetMapping("/{recetaId}")
    public Optional<Receta> getById(@PathVariable("recetaId") Long recetaId){
        return recetaService.getReceta(recetaId);
    }

    // CREATE OR UPDATE
    @PostMapping
    public void saveUpdate(@RequestBody Receta receta){
        recetaService.saveOrUpdate(receta);
    }

    // DELETE
    @DeleteMapping("/{recetaId}")
    public void delete(@PathVariable("recetaId") Long recetaId){
        recetaService.delete(recetaId);
    }
}
