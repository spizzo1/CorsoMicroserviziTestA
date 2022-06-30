package com.example.microserviziocorso.service;

import com.example.microserviziocorso.converter.CorsoConverter;
import com.example.microserviziocorso.entity.Corso;
import com.example.microserviziocorso.repository.CorsoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.microserviziocorso.corsoDto.CorsoDto;

import java.util.List;

@Service
public class CorsoServiceImpl implements CorsoService {

    @Autowired
    CorsoRepository corsoRepository;

    @Autowired
    CorsoConverter corsoConverter;


    @Override
    public void saveCorso(Corso corso) {
        corsoRepository.save(corso);
    }

    @Override
    public List<CorsoDto> findAll() {
        List<Corso> corsi=corsoRepository.findAll();
        return corsoConverter.converterCorso(corsi);
    }


}
