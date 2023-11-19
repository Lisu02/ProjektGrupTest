package com.example.projektgruptest.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Pracownicy")
@Getter
@Setter
public class Pracownik {
    @PrimaryKeyJoinColumn
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPracownika;
    @Column(name = "imie")
    private String imie;
    @Column(name = "nazwisko")
    private String nazwisko;
    @Column(name = "Email")
    private String emailSluzbowy;
    @Column(name = "idRodzajDzialalnosci")
    private Long idRodzajDzialalnosci;

    @Column(name = "idStopniaNaukowego")
    private Long idStopniaNaukowego;
    @Column(name = "idStanowiska")
    private Long idStanowiska;
    @Column(name = "idRoli")
    private Long idRoli;
}
