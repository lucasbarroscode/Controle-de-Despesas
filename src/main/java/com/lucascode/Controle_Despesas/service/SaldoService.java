package com.lucascode.Controle_Despesas.service;

import com.lucascode.Controle_Despesas.repository.SaldoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaldoService {

    @Autowired
    private SaldoRepository saldoRepository;



}
