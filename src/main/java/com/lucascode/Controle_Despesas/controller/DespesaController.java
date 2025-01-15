package com.lucascode.Controle_Despesas.controller;

import com.lucascode.Controle_Despesas.service.DespesaService;
import com.lucascode.Controle_Despesas.service.SaldoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/despesa")
public class DespesaController {

    @Autowired
    private DespesaService despesaService;

    @GetMapping("/test")
    public String teste(){
        return "Está no ar sua api!!!";
    }

}
