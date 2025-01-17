package com.lucascode.Controle_Despesas.controller;

import com.lucascode.Controle_Despesas.model.Renda;
import com.lucascode.Controle_Despesas.model.Saldo;
import com.lucascode.Controle_Despesas.service.RendaService;
import com.lucascode.Controle_Despesas.service.SaldoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController()
@RequestMapping("/renda")
public class RendaController {

    @Autowired
    private RendaService rendaService;


    @GetMapping()
    public List<Renda> listarTodos(){
        return rendaService.listarTodos();
    }

    //todo inserir algo para caso o id passado não for cadastrado
    @GetMapping("/{id}")
    public Optional<Renda> listarPorId(@PathVariable Long id){
        return rendaService.listarPorId(id);
    }

    @PostMapping()
    public Renda salvarRenda(@RequestBody Renda renda){
        return rendaService.salvarRenda(renda);
    }

    @PutMapping("/{id}")
    public Renda atualizarRenda(@PathVariable Long id, @Valid @RequestBody Renda renda){
        return rendaService.atualizarRenda(id, renda);
    }

    @DeleteMapping("/{id}")
    public void deletarRenda(@PathVariable Long id){
        rendaService.deletarPorId(id);
    }

}
