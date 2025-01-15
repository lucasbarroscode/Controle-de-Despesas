package com.lucascode.Controle_Despesas.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Despesas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uuid;
    private Double valor;
    private Date data;
    @ManyToOne
    private Categoria categoria;
    private String descricao;

    public Despesas(){

    }

    public Despesas(Long uuid, Double valor, Date data, Categoria categoria, String descricao) {
        this.uuid = uuid;
        this.valor = valor;
        this.data = data;
        this.categoria = categoria;
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getUuid() {
        return uuid;
    }

    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }
}
