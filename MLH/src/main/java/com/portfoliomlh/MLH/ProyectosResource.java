package com.portfoliomlh.MLH;

import com.portfoliomlh.MLH.model.Proyectos;
import com.portfoliomlh.MLH.service.ProyectosServi;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin (origins = "*")
@RestController
@RequestMapping("/proyectos")
public class ProyectosResource {

    private final ProyectosServi proyectosServi;

    public ProyectosResource(ProyectosServi proyectosServi) {
        this.proyectosServi = proyectosServi;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Proyectos>> getAllProyectos(){
        List<Proyectos> proyectos = proyectosServi.findAllProyectos();
        return new ResponseEntity<>(proyectos, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Proyectos> getProyectosById(@PathVariable("id") Long id){
        Proyectos proyectos = proyectosServi.findProyectosById(id);
        return new ResponseEntity<>(proyectos, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Proyectos> addProyectos(@RequestBody Proyectos proyectos){
        Proyectos newProyectos = proyectosServi.addProyectos(proyectos);
        return new ResponseEntity<>(newProyectos, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Proyectos> updateProyecto(@RequestBody Proyectos proyectos){
        Proyectos updateProyectos = proyectosServi.updateProyectos(proyectos);
        return new ResponseEntity<>(updateProyectos, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteProyectos(@PathVariable("id") Long id){
        proyectosServi.deleteProyectos(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}
