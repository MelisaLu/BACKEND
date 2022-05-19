package com.portfoliomlh.MLH.service;

import com.portfoliomlh.MLH.excepciones.UserNotFoundException;
import com.portfoliomlh.MLH.model.Persona;
import com.portfoliomlh.MLH.repository.PersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;

@Service
public class PersonaServi {
    private final PersonaRepo personaRepo;

    @Autowired
    public PersonaServi(PersonaRepo personaRepo) {
        this.personaRepo = personaRepo;
    }

    public Persona addPersona(Persona persona){
        /*persona.setPersonaCod(UUID.randomUUID().toString());*/
        return (personaRepo.save(persona));
    }
    public  List<Persona> findAllPersonas(){
        return personaRepo.findAll();
    }
    public Persona updatePersona(Persona persona){
        return personaRepo.save(persona);
    }
    public  Persona findPersonaById(Long id){
        return personaRepo.findPersonaById(id).orElseThrow(()->new UserNotFoundException("Persona no encontrada id" + id + "."));
    }

    public void deletePersona(Long id){
        personaRepo.deletePersonaById(id);

    }
}

