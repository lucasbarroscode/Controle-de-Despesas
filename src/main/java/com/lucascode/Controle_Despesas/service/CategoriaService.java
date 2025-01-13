package com.lucascode.Controle_Despesas.service;

import com.lucascode.Controle_Despesas.model.Categoria;
import com.lucascode.Controle_Despesas.model.Saldo;
import com.lucascode.Controle_Despesas.repository.CategoriaRepository;
import com.lucascode.Controle_Despesas.repository.SaldoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria salvarSaldo(Categoria input){
        return categoriaRepository.save(input);
    }

    public List<Categoria> listarTodos(){
        return categoriaRepository.findAll();
    }

    public Optional<Categoria> listarPorId(Long id){
        return categoriaRepository.findById(id);
    }

    public Categoria atualizarSaldo(Long id, Categoria categoria){
        categoria.setUuid(id);
        return categoriaRepository.save(categoria);
    }

    public void deletarPorId(Long id){
        categoriaRepository.deleteById(id);
    }

}
