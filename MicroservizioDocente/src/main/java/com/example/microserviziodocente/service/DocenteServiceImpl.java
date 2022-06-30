package com.example.microserviziodocente.service;

import com.example.microserviziodocente.entity.Docente;
import com.example.microserviziodocente.repository.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DocenteServiceImpl implements DocenteService {


    @Autowired
    DocenteRepository docenteRepository;

    @Override
    public String getNomeCognomeById(Long id) {
        Docente docente = docenteRepository.getReferenceById(id);
        return docente.getNomeDocente() + " " + docente.getCognomeDocente();
    }

    @Override
    public void save(Docente docente){
        docenteRepository.save(docente);
    }

    @Override
    public List<Docente> findAll(){
        return docenteRepository.findAll();
    }
}
