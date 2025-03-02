package com.lucascode.Controle_Despesas.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uuid;
    private Double valor;
    @OneToOne
    @JsonIgnoreProperties
    private Categoria categoria;
    @JsonIgnoreProperties
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataTransacao;




    public Transacao() {
    }

    public Transacao(Long uuid, Double valor, Categoria categoria, LocalDate dataTransacao) {
        this.uuid = uuid;
        this.valor = valor;
        this.categoria = categoria;
        this.dataTransacao = dataTransacao;
    }

    public LocalDate getDataTransacao() {
        return dataTransacao;
    }

    public void setDataTransacao(LocalDate dataTransacao) {
        this.dataTransacao = dataTransacao;
    }

    public Long getUuid() {
        return uuid;
    }

    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
