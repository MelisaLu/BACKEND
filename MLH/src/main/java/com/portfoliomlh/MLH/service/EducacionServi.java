package com.portfoliomlh.MLH.service;

import com.portfoliomlh.MLH.excepciones.UserNotFoundException;
import com.portfoliomlh.MLH.model.Educacion;
import com.portfoliomlh.MLH.repository.EducacionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class EducacionServi {
    private final EducacionRepo eduRepo;

    @Autowired
    public EducacionServi(EducacionRepo eduRepo) {
        this.eduRepo = eduRepo;
    }

    public Educacion addEducacion(Educacion edu){
        return (eduRepo.save(edu));
    }
    public List<Educacion> findAllEducacion(){

        return eduRepo.findAll();
    }
    public Educacion updateEducacion(Educacion edu){
        return eduRepo.save(edu);
    }
    public  Educacion findEducacionById(Long id){
        return eduRepo.findEducacionById(id).orElseThrow(()->new UserNotFoundException("Educacion no encontrada id" + id + "."));
    }


    public void deleteEducacion(Long id){
        eduRepo.deleteEducacionById(id);

    }

}
