package com.portfoliomlh.MLH.service;

import com.portfoliomlh.MLH.excepciones.UserNotFoundException;
import com.portfoliomlh.MLH.model.Habilidades;
import com.portfoliomlh.MLH.repository.HabilidadesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class HabilidadesServi {
    private final HabilidadesRepo habilRepo;

    @Autowired
    public HabilidadesServi(HabilidadesRepo habilRepo) {
        this.habilRepo = habilRepo;
    }

    public Habilidades addHabilidades(Habilidades habilidades){
        return (habilRepo.save(habilidades));
    }
    public List<Habilidades> findAllHabilidades(){
        return habilRepo.findAll();
    }
    public Habilidades updateHabilidades(Habilidades habilidades){
        return habilRepo.save(habilidades);
    }
    public  Habilidades findHabilidadById(Long id){
        return habilRepo.findHabilidadesById(id).orElseThrow(()->new UserNotFoundException("Habilidad no encontrada id" + id + "."));
    }


    public void deleteHabilidades(Long id){
        habilRepo.deleteHabilidadesById(id);

    }

}
