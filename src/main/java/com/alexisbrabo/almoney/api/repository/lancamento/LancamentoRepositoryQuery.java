package com.alexisbrabo.almoney.api.repository.lancamento;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.alexisbrabo.almoney.api.dto.LancamentoEstatisticaCategoria;
import com.alexisbrabo.almoney.api.dto.LancamentoEstatisticaDia;
import com.alexisbrabo.almoney.api.model.Lancamento;
import com.alexisbrabo.almoney.api.repository.filter.LancamentoFilter;
import com.alexisbrabo.almoney.api.repository.projection.ResumoLancamento;

public interface LancamentoRepositoryQuery {
	
	public List<LancamentoEstatisticaCategoria> porCategoria(LocalDate mesReferencia);
	public List<LancamentoEstatisticaDia> porDia(LocalDate mesReferencia);

	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
	public Page<ResumoLancamento> resumir(LancamentoFilter lancamentoFilter, Pageable pageable);
}
