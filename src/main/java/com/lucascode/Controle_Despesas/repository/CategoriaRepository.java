package com.lucascode.Controle_Despesas.repository;

import com.lucascode.Controle_Despesas.model.Categoria;
import com.lucascode.Controle_Despesas.model.Saldo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}