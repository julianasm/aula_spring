package com.example.aulaspring.resource;


import com.example.aulaspring.dto.cooperativa.GetAllCooperativaDto;
import com.example.aulaspring.dto.cooperativa.SaveCooperativaDto;
import com.example.aulaspring.model.Cooperativa;
import com.example.aulaspring.model.Fazendeiro;
import com.example.aulaspring.service.CooperativaService;
import lombok.RequiredArgsConstructor;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cooperativa")
public class CooperativaResource {

    private final CooperativaService service;


    @GetMapping
    public ResponseEntity<List<GetAllCooperativaDto>> getAll(){

        try {
            return ResponseEntity.ok().body(service.getAll());
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/fazendeiros/{idCooperativa}")
    public ResponseEntity<List<Fazendeiro>> getFazendeirosDaCooperativa(@PathVariable("idCooperativa") Long id) {
        try {
            System.out.println("TEste 3");
            return ResponseEntity.ok().body(service.getFazendeiroDaCooperativa(id));
        } catch (Exception e) {
            System.out.println("TEste 3");
            return ResponseEntity.badRequest().build();
        }
    }

    @PostMapping()
    public ResponseEntity<SaveCooperativaDto> save(@RequestBody SaveCooperativaDto cooperativa) {
        try {
            return ResponseEntity.ok().body(service.save(cooperativa));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping
    public ResponseEntity<SaveCooperativaDto> update(@RequestBody SaveCooperativaDto cooperativaDto){
        try {
            return ResponseEntity.ok().body(service.update(cooperativaDto));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping("/{idCooperativa}")
    public ResponseEntity<?> delete(@PathVariable("idCooperativa") Long idCooperativa) {
        try {
            service.deletar(idCooperativa);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
}
