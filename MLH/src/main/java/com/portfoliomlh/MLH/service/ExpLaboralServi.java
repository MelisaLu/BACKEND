package com.portfoliomlh.MLH.service;

import com.portfoliomlh.MLH.excepciones.UserNotFoundException;
import com.portfoliomlh.MLH.model.ExpLaboral;
import com.portfoliomlh.MLH.repository.ExpLaboralRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class ExpLaboralServi {
    private final ExpLaboralRepo expLaboralRepo;

    @Autowired
    public ExpLaboralServi(ExpLaboralRepo expLaboralRepo) {
        this.expLaboralRepo = expLaboralRepo;
    }

    public ExpLaboral addExperienciaLaboral(ExpLaboral expLaboral){
        return (expLaboralRepo.save(expLaboral));
    }
    public List<ExpLaboral> findAllExpLaboral(){
        return expLaboralRepo.findAll();
    }
    public ExpLaboral updateExperienciaLaboral(ExpLaboral expLaboral){
        return expLaboralRepo.save(expLaboral);
    }
    public  ExpLaboral findExpLaboralById(Long id){
        return expLaboralRepo.findExpLaboralById(id).orElseThrow(()->new UserNotFoundException("Experiencia laboral no encontrada id" + id + "."));
    }


    public void deleteExpLaboral(Long id){
        expLaboralRepo.deleteExpLaboralById(id);

    }



}
