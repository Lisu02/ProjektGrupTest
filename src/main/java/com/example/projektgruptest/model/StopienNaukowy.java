package com.example.projektgruptest.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="StopnieNaukowe")
@Getter
@Setter
public class StopienNaukowy {
    @PrimaryKeyJoinColumn
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idStopniaNaukowego;
    @Column(name = "nazwa")
    private String nazwa;
}
