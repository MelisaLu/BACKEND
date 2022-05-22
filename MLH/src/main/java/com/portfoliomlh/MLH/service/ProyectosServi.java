package com.portfoliomlh.MLH.service;

import com.portfoliomlh.MLH.excepciones.UserNotFoundException;
import com.portfoliomlh.MLH.model.Proyectos;
import com.portfoliomlh.MLH.repository.ProyectosRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class ProyectosServi {
    private final ProyectosRepo proyRepo;

    @Autowired
    public ProyectosServi(ProyectosRepo proyRepo) {
        this.proyRepo = proyRepo;
    }

    public Proyectos addProyectos(Proyectos proyectos){
        return (proyRepo.save(proyectos));
    }
    public List<Proyectos> findAllProyectos(){
        return proyRepo.findAll();
    }
    public Proyectos updateProyectos(Proyectos proyectos){
        return proyRepo.save(proyectos);
    }
    public  Proyectos findProyectosById(Long id){
        return proyRepo.findProyectosById(id).orElseThrow(()->new UserNotFoundException("Proyecto no encontrado id" + id + "."));
    }

    public void deleteProyectos(Long id){
        proyRepo.deleteProyectosById(id);
    }

}
