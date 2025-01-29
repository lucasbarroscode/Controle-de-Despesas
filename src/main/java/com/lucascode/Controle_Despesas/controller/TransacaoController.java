package com.lucascode.Controle_Despesas.controller;

import com.lucascode.Controle_Despesas.model.Transacao;
import com.lucascode.Controle_Despesas.service.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/transacao")
public class TransacaoController {

    @Autowired
    private TransacaoService transacaoService;

    @PostMapping
    public Transacao criarTransacao(@RequestBody Transacao transacao) {
        return transacaoService.criarTransacao(transacao);
    }


}
