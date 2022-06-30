package com.example.microserviziocorso.converter;

import com.example.microserviziocorso.corsoDto.CorsoDto;
import com.example.microserviziocorso.entity.Corso;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


@Component
public class CorsoConverter {

    public List<CorsoDto> converterCorso(List<Corso> corsi){

        List<CorsoDto> listaDto=new ArrayList<CorsoDto>();
        for(Corso c: corsi){
            CorsoDto c1=new CorsoDto();
            c1.setNomeCorso(c.getNomeCorso());
            c1.setNomeCognomeDocente(c.getNomeCognomeDocente());
            listaDto.add(c1);
        }
        return listaDto;
    }
}
