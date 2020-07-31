package com.minha.escola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minha.escola.model.Turma;

import java.util.List;


@Repository
public interface TurmaRepository extends JpaRepository<Turma, Long>  {
	
	public List<Turma> findAllByDescricaoContainingIgnoreCase (String descricao); 

}



