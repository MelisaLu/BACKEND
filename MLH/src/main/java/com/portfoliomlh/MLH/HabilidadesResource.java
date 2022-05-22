package com.portfoliomlh.MLH;

import com.portfoliomlh.MLH.model.Habilidades;
import com.portfoliomlh.MLH.service.HabilidadesServi;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/habilidades")
public class HabilidadesResource {

    private final HabilidadesServi habilidadesServi;

    public HabilidadesResource(HabilidadesServi habilidadesServi) {
        this.habilidadesServi = habilidadesServi;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Habilidades>> getAllHabilidades(){
        List<Habilidades> habilidades = habilidadesServi.findAllHabilidades();
        return new ResponseEntity<>(habilidades, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Habilidades> getHabilidadesById(@PathVariable("id") Long id){
        Habilidades habilidades = habilidadesServi.findHabilidadById(id);
        return new ResponseEntity<>(habilidades, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Habilidades> addHabilidades(@RequestBody Habilidades habilidades){
        Habilidades newHabilidades = habilidadesServi.addHabilidades(habilidades);
        return new ResponseEntity<>(newHabilidades, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Habilidades> updateHabilidades(@RequestBody Habilidades habilidades){
        Habilidades updateHabilidades = habilidadesServi.updateHabilidades(habilidades);
        return new ResponseEntity<>(updateHabilidades, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteHabilidades(@PathVariable("id") Long id){
        habilidadesServi.deleteHabilidades(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
