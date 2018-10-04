package com.alexisbrabo.almoney.api.repository.lancamento;

import java.util.List;

import com.alexisbrabo.almoney.api.model.Lancamento;
import com.alexisbrabo.almoney.api.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {

	public List<Lancamento> filtrar(LancamentoFilter lancamentoFilter);
}
