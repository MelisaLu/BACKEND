package com.portfoliomlh.MLH;

import com.portfoliomlh.MLH.model.ExpLaboral;
import com.portfoliomlh.MLH.service.ExpLaboralServi;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin (origins = "*")
@RestController
@RequestMapping("/explaboral")
public class ExpLaboralResource {

    private final ExpLaboralServi expLaboralServi;

    public ExpLaboralResource(ExpLaboralServi expLaboralServi) {
        this.expLaboralServi = expLaboralServi;
    }
    @GetMapping("/all")
    public ResponseEntity<List<ExpLaboral>> getAllExpLaborales(){
        List<ExpLaboral> expLaborals = expLaboralServi.findAllExpLaboral();
        return new ResponseEntity<>(expLaborals, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<ExpLaboral> getExpLaboralById(@PathVariable("id") Long id){
        ExpLaboral expLaboral = expLaboralServi.findExpLaboralById(id);
        return new ResponseEntity<>(expLaboral, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<ExpLaboral> addExperienciaLaboral(@RequestBody ExpLaboral expLaboral){
        ExpLaboral newExpLaboral = expLaboralServi.addExperienciaLaboral(expLaboral);
        return new ResponseEntity<>(newExpLaboral, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<ExpLaboral> updateExperienciaLaboral(@RequestBody ExpLaboral expLaboral){
        ExpLaboral updateExpLaboral = expLaboralServi.updateExperienciaLaboral(expLaboral);
        return new ResponseEntity<>(updateExpLaboral, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteExperienciaLaboral(@PathVariable("id") Long id){
        expLaboralServi.deleteExpLaboral(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}
