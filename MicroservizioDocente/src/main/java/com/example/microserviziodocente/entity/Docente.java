package com.example.microserviziodocente.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Docente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column
    private String nomeDocente;
    @Column
    private String cognomeDocente;


}
