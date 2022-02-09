package com.example.aulaspring.dto.cooperativa;


import com.example.aulaspring.model.Fazendeiro;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SaveFazendaDto {

    private Long id;
    private Fazendeiro fazendeiro;
    private String descricao;
    private Double area;
    private Double latitude;
    private Double longitude;
}
