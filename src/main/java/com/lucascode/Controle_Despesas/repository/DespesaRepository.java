package com.lucascode.Controle_Despesas.repository;

import com.lucascode.Controle_Despesas.model.Despesas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DespesaRepository extends JpaRepository<Despesas, Long> {
}