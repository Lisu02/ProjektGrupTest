package com.example.projektgruptest.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="KryteriaOceny")
@Getter
@Setter
public class KryteriaOceny {
    @PrimaryKeyJoinColumn
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long IdKryterium;
    @Column(name = "czyPosiadaStopienNaukowy")
    private Boolean czyPosiadaStopienNaukowy;
    @Column(name = "czyNaStanowiskuKierowniczym")
    private Boolean czyNaStanowiskuKierowniczym;
//    @ManyToOne //Połącznenie
//    @JoinColumn (name = "idRodzajuDzialalnosci")
//    private RodzajDzialalnosci rodzajDzialalnosci ;
    @Column(name = "progPozytywnejOcenyNB")
    private Integer progPozytywnejOcenyNB;
    @Column(name = "progOcenyZWyroznieniemNB")
    private Integer progOcenyZWyroznieniemNB;
    @Column(name = "progPozytywnejOcenyDO")
    private Integer progPozytywnejOcenyDO;
    @Column(name = "progOcenyZWyroznieniemDO")
    private Integer progOcenyZWyroznieniemDO;

//    @ManyToOne
//    @JoinColumn(name = "")
//    private RodzajDzialalnosci idrodzajDzialalnosci;

//    @ManyToOne
//    @JoinColumn(name = "kryteriaOceny_RodzajDzialalnosci")
//    private RodzajDzialalnosci rodzajDzialalnosci;

}
