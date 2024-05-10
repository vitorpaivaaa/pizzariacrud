package br.itb.projeto.pizzaria3g.rest.controller;

import java.util.List;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.itb.projeto.pizzaria3g.model.entity.Categoria;
import br.itb.projeto.pizzaria3g.service.CategoriaService;

@RestController
@RequestMapping("/categoria/")
public class CategoriaController {

	private CategoriaService categoriaService;
	// Source -> Generate Constructor using Fields...

	public CategoriaController(CategoriaService categoriaService) {
		this.categoriaService = categoriaService;
	}

	@GetMapping("findAll")
	public ResponseEntity<List<Categoria>> findAll() {
		List<Categoria> categorias = categoriaService.findAll();

		return new ResponseEntity<List<Categoria>>(categorias, HttpStatus.OK);
	}

	@PostMapping("create")
	public ResponseEntity<Categoria> create(@RequestBody Categoria categoria) {

		Categoria _categoria = categoriaService.create(categoria);

		return new ResponseEntity<Categoria>(_categoria, HttpStatus.OK);

	}

}
