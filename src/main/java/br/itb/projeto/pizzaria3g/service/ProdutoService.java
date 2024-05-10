package br.itb.projeto.pizzaria3g.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.itb.projeto.pizzaria3g.model.entity.Produto;
import br.itb.projeto.pizzaria3g.model.repository.ProdutoRepository;

@Service
public class ProdutoService {

  private ProdutoRepository produtoRepository;
  // Source -> Generate Constructor using Fields...

  public ProdutoService(ProdutoRepository produtoRepository) {
	 this.produtoRepository = produtoRepository;
  }

  public List<Produto> findAll() {
	List<Produto> produtos = produtoRepository.findAll();
	return produtos;
  }
}
