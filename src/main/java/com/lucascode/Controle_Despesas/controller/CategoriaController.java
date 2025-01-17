package com.lucascode.Controle_Despesas.controller;


import com.lucascode.Controle_Despesas.model.Categoria;
import com.lucascode.Controle_Despesas.model.Saldo;
import com.lucascode.Controle_Despesas.service.CategoriaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController()
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService service;

    @GetMapping()
    public List<Categoria> listarTodos(){
        return service.listarTodos();
    }

    //todo inserir algo para caso o id passado não for cadastrado
    @GetMapping("/{id}")
    public Optional<Categoria> listarPorId(@PathVariable Long id){
        return service.listarPorId(id);
    }

    @PostMapping()
    public Categoria salvarCategoria(@RequestBody Categoria categoria){
        return service.salvarCategoria(categoria);
    }

    @PutMapping("/{id}")
    public Categoria atualizarCategoria(@PathVariable Long id, @Valid @RequestBody Categoria categoria){
        return service.atualizarCategoria(id, categoria);
    }

    @DeleteMapping("/{id}")
    public void deletarCategoria(@PathVariable Long id){
        service.deletarPorId(id);
    }



}
