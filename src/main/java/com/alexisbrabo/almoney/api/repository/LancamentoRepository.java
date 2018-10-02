package com.alexisbrabo.almoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexisbrabo.almoney.api.model.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
