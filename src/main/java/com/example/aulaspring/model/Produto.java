package com.example.aulaspring.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "PRODUTO")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "LATITUDE")
    private Double latitude;

    @Column(name = "ID_CIDADE")
    private Double id_cidade;

    @Column(name = "ATIVO")
    private Boolean ativo;
}
