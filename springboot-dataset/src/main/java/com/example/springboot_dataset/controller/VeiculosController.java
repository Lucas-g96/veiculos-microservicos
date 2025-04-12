package com.example.springboot_dataset.controller;

import com.example.springboot_dataset.model.Veiculo;
import com.example.springboot_dataset.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculos")
public class VeiculosController {

    @Autowired
    private VeiculoService veiculoService;

    @GetMapping
    public List<Veiculo> getAllVeiculos() {
        return veiculoService.getAllVeiculos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Veiculo> getVeiculoById(@PathVariable String id) {
        return veiculoService.getVeiculoById(id);
    }

    @GetMapping("/ano")
    public List<Veiculo> getAllVeiculosByAno(@RequestParam String ano) {
        return veiculoService.getAllVeiculosByAno(ano);
    }
}
