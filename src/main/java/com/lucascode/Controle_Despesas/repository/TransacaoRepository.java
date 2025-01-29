package com.lucascode.Controle_Despesas.repository;

import com.lucascode.Controle_Despesas.model.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
}
