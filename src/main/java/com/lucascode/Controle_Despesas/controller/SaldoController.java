package com.lucascode.Controle_Despesas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/saldo")
public class SaldoController {

    @GetMapping("/test")
    public String teste(){
        return "Está no ar sua api!!!";
    }

}
