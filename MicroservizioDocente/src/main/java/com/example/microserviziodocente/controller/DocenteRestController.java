package com.example.microserviziodocente.controller;

import com.example.microserviziodocente.entity.Docente;
//import com.example.demoacademyspring2.entity.entityDto.DocenteDto;
import com.example.microserviziodocente.service.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/api/docente")
public class DocenteRestController {

    @Autowired
    DocenteService docenteService;


    @GetMapping(value = "getNomeCognomeById")
    public String getNomeCognomeById(@RequestParam Long id){

        return docenteService.getNomeCognomeById(id);


    }
    @GetMapping(value="getDocenti")
    public List<Docente> getDocenti(){
        return docenteService.findAll();
    }

    @PostMapping(value="addDocente")
    public String addDocente(@RequestBody Docente docente){

        docenteService.save(docente);
        return "Docente salvato";
    }

  /*  @DeleteMapping(value="deleteDocente")
    public String deleteDocente(@RequestBody Docente docente){

        docenteService.deleteById((long)docente.getId());
        return "Docente eliminato";
    }

    @GetMapping(value="findDocente")
    public Optional<Docente> findDocente(@RequestBody Docente id){

        return docenteService.findById(id.getId());
    }

    @PutMapping(value="updateDocente")
    public String updateDocente(@RequestBody Docente docente){

        if((Object)docenteService.findById(docente.getId())!=null && docente.getId()!=null)
            docenteService.save(docente);
        return "docente_modificato";
    }

*/
}