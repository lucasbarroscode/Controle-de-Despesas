package com.lucascode.Controle_Despesas.service;

import com.lucascode.Controle_Despesas.model.Renda;
import com.lucascode.Controle_Despesas.repository.RendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RendaService {

    @Autowired
    private RendaRepository rendaRepository;

    public Renda salvarSaldo(Renda input){
        return rendaRepository.save(input);
    }

    public List<Renda> listarTodos(){
        return rendaRepository.findAll();
    }

    public Optional<Renda> listarPorId(Long id){
        return rendaRepository.findById(id);
    }

    public Renda atualizarSaldo(Long id, Renda renda){
        renda.setUuid(id);
        return rendaRepository.save(renda);
    }

    public void deletarPorId(Long id){
        rendaRepository.deleteById(id);
    }


}
