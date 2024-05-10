package br.itb.projeto.pizzaria3g.rest.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.itb.projeto.pizzaria3g.model.entity.Produto;
import br.itb.projeto.pizzaria3g.service.ProdutoService;

@RestController
@RequestMapping("/produto/")
public class ProdutoController {

  private ProdutoService produtoService;
  // Source -> Generate Constructor using Fields...

  public ProdutoController(ProdutoService produtoService) {
	 this.produtoService = produtoService;
  }

  @GetMapping("findAll")
  public ResponseEntity<List<Produto>> findAll(){
	List<Produto> produtos = produtoService.findAll();
	
	return new ResponseEntity<List<Produto>>
					(produtos, HttpStatus.OK);
  }
}

