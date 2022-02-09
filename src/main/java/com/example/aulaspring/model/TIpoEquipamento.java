package com.example.aulaspring.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "TIPO_EQUIPAMENTO")
public class TIpoEquipamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
}
