package com.lucascode.Controle_Despesas.controller;

import com.lucascode.Controle_Despesas.model.Despesas;
import com.lucascode.Controle_Despesas.model.Saldo;
import com.lucascode.Controle_Despesas.service.DespesaService;
import com.lucascode.Controle_Despesas.service.SaldoService;
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
    public Despesas salvarSaldo(@RequestBody Despesas despesas){
        return despesaService.salvarSaldo(despesas);
    }

    @PutMapping("/{id}")
    public Despesas atualizarSaldo(@PathVariable Long id, @Valid @RequestBody Despesas despesas){
        return despesaService.atualizarSaldo(id, despesas);
    }

    @DeleteMapping("/{id}")
    public void deletarSaldo(@PathVariable Long id){
        despesaService.deletarPorId(id);
    }

}
