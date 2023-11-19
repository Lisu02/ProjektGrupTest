package com.example.projektgruptest.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="KategorieOsiagniec")
@Getter
@Setter
public class KategoriaOsiagniec {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idKategoriaOsiagniec;
    @Column(name = "nazwaKategorii")
    private String nazwaKategorii;
//    @Column(name = "idRodzajDzialalnosci")
//    private Long idRodzajDzialalnosci;

//    @ManyToOne
//    @JoinColumn(name = "idRodzajDzialalnosci")
//    private RodzajDzialalnosci idRodzajDzialalnosci;
//    //TODO: KLUCZ RODZAJDZIALANSOCI_IDRODZAJDZIALANSOCI Z OBRAZKA
}
