package com.example.projektgruptest.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Wnioski")
@Getter
@Setter
public class Wniosek {
    @PrimaryKeyJoinColumn
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idWniosku;
    @Column(name = "idPracownika")
    private Long idPracownika;
    @Column(name = "idOkresu")
    private Long idOkresu;


    //TODO:OkresRozliczeniowy-idOkresu
}
