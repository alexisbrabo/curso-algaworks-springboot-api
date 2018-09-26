package com.alexisbrabo.almoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexisbrabo.almoney.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
