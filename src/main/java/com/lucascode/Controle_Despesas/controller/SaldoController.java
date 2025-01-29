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

    @GetMapping
    public Saldo obterSaldo() {
        return saldoService.obterSaldoAtual();
    }







}
