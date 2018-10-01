package com.alexisbrabo.almoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexisbrabo.almoney.api.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
