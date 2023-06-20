package com.will.minhasfinancas.model.repository;

import com.will.minhasfinancas.model.entily.Lancamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

}
