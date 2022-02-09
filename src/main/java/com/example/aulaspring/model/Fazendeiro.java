package com.example.aulaspring.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Entity
@Table(name = "FAZENDEIRO")
@Data
public class Fazendeiro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "TELEFONE")
    private String telefone;

    public Fazendeiro(Long id) {
        this.id = id;
    }

    @ManyToMany
    @JsonBackReference
    @JoinTable(name = "COOPERATIVA_FAZENDEIRO", joinColumns = {
            @JoinColumn(name = "ID_FAZENDEIRO", referencedColumnName = "ID") }, inverseJoinColumns = {
            @JoinColumn(name = "ID_COOPERATIVA", referencedColumnName = "ID") })
    private List<Cooperativa> cooperativass;
}
