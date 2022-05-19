package com.portfoliomlh.MLH;


import com.portfoliomlh.MLH.model.Persona;
import com.portfoliomlh.MLH.service.PersonaServi;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaResource {
    private final PersonaServi personaServi;

    public PersonaResource(PersonaServi personaServi) {
        this.personaServi = personaServi;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Persona>> getAllPersonas(){
        List<Persona> personas = PersonaServi.findAllPersonas();
        return new ResponseEntity<>(personas, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Persona> getPersonaById(@PathVariable("id") Long id){
        Persona persona = PersonaServi.findPersonaById(id);
        return new ResponseEntity<>(persona, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Persona> addPersona(@RequestBody Persona persona){
        Persona newPersona = personaServi.addPersona(persona);
        return new ResponseEntity<>(newPersona, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Persona> updatePersona(@RequestBody Persona persona){
        Persona updatePersona = personaServi.updatePersona(persona);
        return new ResponseEntity<>(updatePersona, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePersona(@PathVariable("id") Long id){
        personaServi.deletePersona(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
