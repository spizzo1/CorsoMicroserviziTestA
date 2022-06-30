package com.example.microserviziodocente.service;

import com.example.microserviziodocente.entity.Docente;

import java.util.List;

public interface DocenteService {
    String getNomeCognomeById(Long id);

    public void save(Docente docente);

    public List<Docente> findAll();
}
