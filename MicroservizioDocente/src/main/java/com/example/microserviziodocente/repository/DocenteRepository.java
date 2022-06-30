package com.example.microserviziodocente.repository;

import com.example.microserviziodocente.entity.Docente;
import com.example.microserviziodocente.entity.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocenteRepository extends JpaRepository<Docente,Long> {



}
