package com.lucascode.Controle_Despesas.controller;

import com.lucascode.Controle_Despesas.model.Saldo;
import com.lucascode.Controle_Despesas.service.SaldoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

}
