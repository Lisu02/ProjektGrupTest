package com.example.projektgruptest.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name="RodzajeDzialalnosci")
@Getter
@Setter
public class RodzajDzialalnosci {
    @PrimaryKeyJoinColumn
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idRodzajDzialalnosci;
    @Column(name = "nazwa")
    private String nazwa;


    //KLUCZE OBCE
//    @OneToMany(mappedBy = "idrodzajDzialalnosci", orphanRemoval = true)
//    private Set<KryteriaOceny> idkryteriaOceny = new LinkedHashSet<>();
//    //
//    @OneToMany(mappedBy = "idKategoriaOsiagniec", orphanRemoval = true)
//    private Set<KategoriaOsiagniec> idKategoriaOsiagniec = new LinkedHashSet<>();

}
