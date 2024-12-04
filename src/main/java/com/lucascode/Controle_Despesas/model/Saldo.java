package com.lucascode.Controle_Despesas.model;

import java.util.Date;

public class Saldo {
    private Double valor;
    private Date data;

    public Saldo(){

    }

    public Saldo(Double valor, Date data) {
        this.valor = valor;
        this.data = data;
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
}
