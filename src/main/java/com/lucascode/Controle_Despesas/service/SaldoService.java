package com.lucascode.Controle_Despesas.service;

import com.lucascode.Controle_Despesas.model.Saldo;
import com.lucascode.Controle_Despesas.repository.SaldoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SaldoService {

    @Autowired
    private SaldoRepository saldoRepository;

    public Saldo salvarSaldo(Saldo input){
        return saldoRepository.save(input);
    }

    public List<Saldo> listarTodos(){
        return saldoRepository.findAll();
    }

    public Optional<Saldo> listarPorId(Long id){
        return saldoRepository.findById(id);
    }


}
