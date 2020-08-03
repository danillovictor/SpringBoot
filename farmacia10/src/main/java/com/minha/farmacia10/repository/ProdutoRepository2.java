package com.minha.farmacia10.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minha.farmacia10.model.ProdutoModel2;


public interface ProdutoRepository2 extends JpaRepository<ProdutoModel2, Long> {
	public List<ProdutoModel2> findAllByNomeContainingIgnoreCase (String nome);

}
