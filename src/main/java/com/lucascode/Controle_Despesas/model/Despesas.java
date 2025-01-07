package com.lucascode.Controle_Despesas.model;

import java.util.Date;

public class Despesas {

    private Double valor;
    private Date data;
    private Categoria categoria;
    private String descricao;

    public Despesas(){

    }

    public Despesas(Double valor, Date data, Categoria categoria, String descricao) {
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
}
