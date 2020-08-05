package com.minhaRedeSocial.RedeSocial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minhaRedeSocial.RedeSocial.model.Postagem;


public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	public List<Postagem> findAllByDescricaoContainingIgnoreCase (String descricao);

}