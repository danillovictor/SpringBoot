package com.minha.farmacia10.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minha.farmacia10.model.CategoriaModel;

public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long> {
	public List<CategoriaModel> findAllByDescricaoContainingIgnoreCase (String descricao);

}