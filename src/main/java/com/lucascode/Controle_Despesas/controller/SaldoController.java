package com.lucascode.Controle_Despesas.controller;

import com.lucascode.Controle_Despesas.model.Saldo;
import com.lucascode.Controle_Despesas.service.SaldoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController()
@RequestMapping("/saldo")
public class SaldoController {

    @Autowired
    private SaldoService saldoService;

    @GetMapping("/test")
    public String teste(){
        return "Está no ar sua api!!!";
    }

    @GetMapping()
    public List<Saldo> listarTodos(){
        return saldoService.listarTodos();
    }

    //todo inserir algo para caso o id passado não for cadastrado
    @GetMapping("/{id}")
    public Optional<Saldo> listarPorId(@PathVariable Long id){
        return saldoService.listarPorId(id);
    }

    @PostMapping()
    public Saldo salvarSaldo(@RequestBody Saldo saldo){
        return saldoService.salvarSaldo(saldo);
    }

    @PutMapping("/{id}")
    public Saldo atualizarSaldo(@PathVariable Long id, @Valid @RequestBody Saldo saldo){
        return saldoService.atualizarSaldo(id, saldo);
    }

    @DeleteMapping("/{id}")
    public void deletarSaldo(@PathVariable Long id){
        saldoService.deletarPorId(id);
    }



}
