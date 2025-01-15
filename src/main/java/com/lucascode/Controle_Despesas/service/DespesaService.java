package com.lucascode.Controle_Despesas.service;

import com.lucascode.Controle_Despesas.model.Despesas;
import com.lucascode.Controle_Despesas.model.Saldo;
import com.lucascode.Controle_Despesas.repository.DespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DespesaService {


    @Autowired
    private DespesaRepository repository;

    public Despesas salvarSaldo(Despesas input){
        return repository.save(input);
    }

    public List<Despesas> listarTodos(){
        return repository.findAll();
    }

    public Optional<Despesas> listarPorId(Long id){
        return repository.findById(id);
    }

    public Despesas atualizarSaldo(Long id, Despesas despesas){
        despesas.setUuid(id);
        return repository.save(despesas);
    }

    public void deletarPorId(Long id){
        repository.deleteById(id);
    }
}
