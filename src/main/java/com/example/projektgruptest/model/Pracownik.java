package com.example.projektgruptest.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Pracownik")
@Getter
@Setter
public class Pracownik {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPracownika;
}
