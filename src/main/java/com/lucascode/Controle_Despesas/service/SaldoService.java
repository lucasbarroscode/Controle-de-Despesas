package com.lucascode.Controle_Despesas.service;

import com.lucascode.Controle_Despesas.model.Saldo;
import com.lucascode.Controle_Despesas.model.Transacao;
import com.lucascode.Controle_Despesas.repository.SaldoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class SaldoService {

    @Autowired
    private SaldoRepository saldoRepository;

    public Saldo atualizarSaldo(Transacao transacao){
        Saldo saldo = saldoRepository.findById(1L).orElse(new Saldo());
        saldo.setUuid(1L);

        if(saldo.getValor() == null){
            saldo.setValor(0.0);
        }
        saldo.setValor(saldo.getValor() + transacao.getValor());
        return saldoRepository.save(saldo);
    }

    //todo cadastrar quando não achar nada para não retornar null
    public Saldo obterSaldoAtual(){
        return saldoRepository.findById(1L).orElse(new Saldo());
    }


}
