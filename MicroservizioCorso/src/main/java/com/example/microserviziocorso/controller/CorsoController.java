package com.example.microserviziocorso.controller;

import com.example.microserviziocorso.corsoDto.CorsoDto;
import com.example.microserviziocorso.docenteClient.DocenteClient;
import com.example.microserviziocorso.entity.Corso;
import com.example.microserviziocorso.service.CorsoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/corso")
public class CorsoController {

    @Autowired
    CorsoService corsoService;

    @Autowired
    DocenteClient docenteClient;


    @GetMapping(value = "/getAllCorsi")
    public List<Corso> getAllCorsi(){

        return null;
    }


    @PostMapping(value = "/saveCorso")
    public void saveNewCorso(@RequestBody Corso corso,@RequestParam Long idDocente){

        String nomecognome = docenteClient.getNomeCognomeDocente(idDocente);
        corso.setNomeCognomeDocente(nomecognome);
        corso.setIdDocente(idDocente);
        corsoService.saveCorso(corso);
        System.out.println("Corso salvato");
    }

    @GetMapping(value="/getCorso")
    public List<CorsoDto> getCorso(){

        return corsoService.findAll();

    }
}