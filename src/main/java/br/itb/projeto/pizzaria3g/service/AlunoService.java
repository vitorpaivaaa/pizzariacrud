package br.itb.projeto.pizzaria3g.service;

import java.util.ArrayList;
import java.util.List;

import br.itb.projeto.pizzaria3g.model.entity.Aluno;
import br.itb.projeto.pizzaria3g.model.repository.AlunoRepository;

public class AlunoService implements AlunoRepository {

	@Override
	public Aluno find() {
		Aluno aluno = new Aluno(98765, "Ordnael Zurc", 35);
		return aluno;
	}

	@Override
	public List<Aluno> findAll() {
		List<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(new Aluno(98765, "Ordnael", 35));
		alunos.add(new Aluno(98769, "Airam", 1));
		alunos.add(new Aluno(98762, "Ana", 5));
		
		return alunos;
	}

	@Override
	public Aluno findByRm(long rm) {
		List<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(new Aluno(98765, "Ordnael", 35));
		alunos.add(new Aluno(98769, "Airam", 1));
		alunos.add(new Aluno(98762, "Ana", 5));
		for (int i = 0; i < alunos.size(); i++) {
			if (alunos.get(i).getRm() == rm) {
				return alunos.get(i);
			}
		}
		
		return null;
	}



}



