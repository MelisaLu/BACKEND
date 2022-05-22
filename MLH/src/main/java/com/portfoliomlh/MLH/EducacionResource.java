package com.portfoliomlh.MLH;

import com.portfoliomlh.MLH.model.Educacion;
import com.portfoliomlh.MLH.service.EducacionServi;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/educacion")
public class EducacionResource {

    private final EducacionServi educacionServi;

    public EducacionResource(EducacionServi educacionServi) {
        this.educacionServi = educacionServi;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Educacion>> getAllEducacion(){
        List<Educacion> educacions = educacionServi.findAllEducacion();
        return new ResponseEntity<>(educacions, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Educacion> getEducacionById (@PathVariable("id") Long id){
        Educacion educacion = educacionServi.findEducacionById(id);
        return new ResponseEntity<>(educacion, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Educacion> addEducacion(@RequestBody Educacion educacion){
        Educacion newEducacion = educacionServi.addEducacion(educacion);
        return new ResponseEntity<>(newEducacion, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Educacion> updateEducacion(@RequestBody Educacion educacion){
        Educacion updateEducacion = educacionServi.updateEducacion(educacion);
        return new ResponseEntity<>(updateEducacion, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEducacion(@PathVariable("id") Long id){
        educacionServi.deleteEducacion(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}
