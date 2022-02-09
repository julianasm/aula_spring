package com.example.aulaspring.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "COOPERATIVA")
//@SequenceGenerator(name="SEQ_COOPERATIVA", sequenceName = "SEQ_COOPERATIVA", allocationSize = 1)
public class Cooperativa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "ATIVO")
    private Boolean ativo;

    @ManyToMany
    @JsonManagedReference
    @JoinTable(name = "COOPERATIVA_FAZENDEIRO", joinColumns = {
            @JoinColumn(name = "ID_COOPERATIVA", referencedColumnName = "ID") }, inverseJoinColumns = {
            @JoinColumn(name = "ID_FAZENDEIRO", referencedColumnName = "ID") })
    private List<Fazendeiro> fazendeiros;

}
