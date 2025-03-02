package com.lucascode.Controle_Despesas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Saldo {

    @Id
    private Long uuid;
    private Double valor;


    public Saldo(){

    }

    public Saldo(Long uuid, Double valor) {
        this.uuid = uuid;
        this.valor = valor;
    }

    public Saldo(Saldo saldo) {
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

}
