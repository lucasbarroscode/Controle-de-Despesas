package com.lucascode.Controle_Despesas.controller;

import com.lucascode.Controle_Despesas.model.Despesas;
import com.lucascode.Controle_Despesas.service.DespesaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController()
@RequestMapping("/despesa")
public class DespesaController {

    @Autowired
    private DespesaService despesaService;

    @GetMapping("/test")
    public String teste(){
        return "Está no ar sua api!!!";
    }


    @GetMapping()
    public List<Despesas> listarTodos(){
        return despesaService.listarTodos();
    }

    //todo inserir algo para caso o id passado não for cadastrado
    @GetMapping("/{id}")
    public Optional<Despesas> listarPorId(@PathVariable Long id){
        return despesaService.listarPorId(id);
    }

    @PostMapping()
    public Despesas salvarDespesa(@RequestBody Despesas despesas){
        return despesaService.salvarDespesa(despesas);
    }

    @PutMapping("/{id}")
    public Despesas atualizarDespesa(@PathVariable Long id, @Valid @RequestBody Despesas despesas){
        return despesaService.atualizarDespesa(id, despesas);
    }

    @DeleteMapping("/{id}")
    public void deletarDespesa(@PathVariable Long id){
        despesaService.deletarPorId(id);
    }

}
