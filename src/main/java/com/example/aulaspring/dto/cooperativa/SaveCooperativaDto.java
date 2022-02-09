package com.example.aulaspring.dto.cooperativa;

import com.example.aulaspring.model.Cooperativa;
import com.example.aulaspring.model.Fazendeiro;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@AllArgsConstructor
@Data
public class SaveCooperativaDto {
    private Long id;
    private String nome;
    private String email;
    private Boolean ativo;
    private List<Long> fazendeiros;


    @JsonIgnore
    public Cooperativa pegarModel() {
        Cooperativa cooperativa = new Cooperativa();
        cooperativa.setAtivo(true);
        cooperativa.setNome(this.nome);
        cooperativa.setEmail(this.nome);
        cooperativa.setId(this.id);
        cooperativa.setFazendeiros(fazendeiros.stream().map(Fazendeiro::new).collect(Collectors.toList()));
        return cooperativa;
    }

}
