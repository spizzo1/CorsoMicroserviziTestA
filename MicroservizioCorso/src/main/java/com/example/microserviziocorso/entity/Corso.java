package com.example.microserviziocorso.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Corso {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nomeCorso;

    private String durataCorso;

    private Date dataDiInizio;

    private Date dataDiFine;

    private  String nomeCognomeDocente;

    private Long idDocente;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCorso() {
        return nomeCorso;
    }

    public void setNomeCorso(String nomeCorso) {
        this.nomeCorso = nomeCorso;
    }

    public String getDurataCorso() {
        return durataCorso;
    }

    public void setDurataCorso(String durataCorso) {
        this.durataCorso = durataCorso;
    }

    public Date getDataDiInizio() {
        return dataDiInizio;
    }

    public void setDataDiInizio(Date dataDiInizio) {
        this.dataDiInizio = dataDiInizio;
    }

    public Date getDataDiFine() {
        return dataDiFine;
    }

    public void setDataDiFine(Date dataDiFine) {
        this.dataDiFine = dataDiFine;
    }

    public String getNomeCognomeDocente() {
        return nomeCognomeDocente;
    }

    public void setNomeCognomeDocente(String nomeCognomeDocente) {
        this.nomeCognomeDocente = nomeCognomeDocente;
    }

    public Long getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(Long idDocente) {
        this.idDocente = idDocente;
    }
}
