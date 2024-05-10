package br.itb.projeto.pizzaria3g.model.repository;

import java.util.List;

import br.itb.projeto.pizzaria3g.model.entity.Aluno;

public interface AlunoRepository {

	Aluno find();
	
	List<Aluno> findAll();
	
	Aluno findByRm(long rm);
}











