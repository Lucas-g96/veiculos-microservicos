package com.example.springboot_dataset.repository;

import com.example.springboot_dataset.model.Veiculo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VeiculoRepository extends MongoRepository<Veiculo, String> {

    List<Veiculo> findByAno(String ano);
}