package com.example.springboot_dataset.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "veiculos")
public class Veiculo {

    @Id
    private String id;
    private String placa;
    private String marca;
    private String modelo;
    private String ano;
    private String cor;
    private Integer kmRodados;
    private Float preco;
    private String tipo;
    private Boolean automatico;

    // Getters e Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getAno() { return ano; }
    public void setAno(String ano) { this.ano = ano; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public Integer getKmRodados() { return kmRodados; }
    public void setKmRodados(Integer kmRodados) { this.kmRodados = kmRodados; }

    public Float getPreco() { return preco; }
    public void setPreco(Float preco) { this.preco = preco; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public Boolean getAutomatico() { return automatico; }
    public void setAutomatico(Boolean automatico) { this.automatico = automatico; }
}
