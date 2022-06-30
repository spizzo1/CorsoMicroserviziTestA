package com.example.microserviziocorso.service;

import com.example.microserviziocorso.corsoDto.CorsoDto;
import com.example.microserviziocorso.entity.Corso;

import java.util.List;

public interface CorsoService {
    void saveCorso(Corso corso);

    List<CorsoDto> findAll();
}