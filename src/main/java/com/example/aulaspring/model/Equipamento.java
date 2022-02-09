package com.example.aulaspring.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "EQUIPAMENTO")
public class Equipamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_TIPO_EQUIPAMENTO")
    private TIpoEquipamento tIpoEquipamento;

    private String descricao;

    private Double Latitude;

    private Double Longitude;

    private Boolean ativo;

}
