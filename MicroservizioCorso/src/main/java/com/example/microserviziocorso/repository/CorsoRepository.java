package com.example.microserviziocorso.repository;

import com.example.microserviziocorso.entity.Corso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface CorsoRepository extends JpaRepository<Corso,Long> {

}