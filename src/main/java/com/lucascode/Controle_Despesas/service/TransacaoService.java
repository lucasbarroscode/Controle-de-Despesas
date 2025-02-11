package com.lucascode.Controle_Despesas.service;

import com.lucascode.Controle_Despesas.model.Transacao;
import com.lucascode.Controle_Despesas.repository.CategoriaRepository;
import com.lucascode.Controle_Despesas.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.springframework.util.ObjectUtils.isEmpty;

@Service
public class TransacaoService {

    @Autowired
    private TransacaoRepository transacaoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;



    @Autowired
    private SaldoService saldoService;


    //todo colocar um validor se categoria não existir
    //orElseThrow(() -> new RuntimeException("Transação não encontrada"));
    public Transacao criarTransacao(Transacao transacao) {

        LocalDateTime agora = LocalDateTime.now();
        if(isEmpty(transacao.getDataTransacao())){
            transacao.setDataTransacao(LocalDate.from(agora));
        }

        //todo condicional de que se a categoria existe, não precisa criar uma nova com o mesmo nome
        categoriaRepository.save(transacao.getCategoria());
        Transacao novaTransacao = transacaoRepository.save(transacao);
        saldoService.atualizarSaldo(novaTransacao);
        return novaTransacao;
    }


}
