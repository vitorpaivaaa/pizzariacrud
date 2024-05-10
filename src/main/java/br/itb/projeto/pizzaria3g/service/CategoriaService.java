package br.itb.projeto.pizzaria3g.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.itb.projeto.pizzaria3g.model.entity.Categoria;
import br.itb.projeto.pizzaria3g.model.repository.CategoriaRepository;
import jakarta.transaction.Transactional;

@Service
public class CategoriaService {

	private CategoriaRepository categoriaRepository;
	// Source -> Generate Constructor using Fields...

	public CategoriaService(CategoriaRepository categoriaRepository) {
		this.categoriaRepository = categoriaRepository;
	}

	public List<Categoria> findAll() {
		List<Categoria> categorias = categoriaRepository.findAll();
		return categorias;
	}

	@Transactional
	public Categoria create(Categoria categoria) {
		return categoriaRepository.save(categoria);
	}

	
}
