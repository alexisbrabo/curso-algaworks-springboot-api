package com.alexisbrabo.almoney.api.repository.lancamento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.alexisbrabo.almoney.api.model.Lancamento;
import com.alexisbrabo.almoney.api.repository.filter.LancamentoFilter;
import com.alexisbrabo.almoney.api.repository.projection.ResumoLancamento;

public interface LancamentoRepositoryQuery {

	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
	public Page<ResumoLancamento> resumir(LancamentoFilter lancamentoFilter, Pageable pageable);
}
