package com.example.projektgruptest.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="PodKategorie")
@Getter
@Setter
public class PodKategoria {
    @PrimaryKeyJoinColumn
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPodKategorii;
    @Column(name = "idKategorii")
    private Long idKategorii;
    @Column(name = "nazwa")
    private String nazwa;
    @Column(name = "minPunktow")
    private Integer minPunktow;
    @Column(name = "maxPunktow")
    private Integer maxPunktow;
    //TODO:KLUCZE OBCE
}
