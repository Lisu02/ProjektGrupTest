package com.example.projektgruptest.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="PracownikStanowiska")
@Getter
@Setter
public class PracownikStanowisko {
    @PrimaryKeyJoinColumn
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idStanowiska;
    @Column(name = "nazwa")
    private String nazwa;
}
