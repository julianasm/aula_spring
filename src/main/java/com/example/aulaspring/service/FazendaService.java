package com.example.aulaspring.service;

import com.example.aulaspring.repository.FazendaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class FazendaService {

    private final FazendaRepository fazendaRepository;


}
