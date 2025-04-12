package com.example.springboot_dataset.service;

import com.example.springboot_dataset.model.Veiculo;
import com.example.springboot_dataset.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    public List<Veiculo> getAllVeiculos() {
        return veiculoRepository.findAll();
    }

    public ResponseEntity<Veiculo> getVeiculoById(String id) {
        return veiculoRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    public List<Veiculo> getAllVeiculosByAno(String ano) {
        return veiculoRepository.findByAno(ano);
    }
}
