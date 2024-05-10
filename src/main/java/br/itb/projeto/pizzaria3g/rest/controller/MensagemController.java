package br.itb.projeto.pizzaria3g.rest.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.itb.projeto.pizzaria3g.model.entity.Mensagem;
import br.itb.projeto.pizzaria3g.service.MensagemService;

@RestController
	@RequestMapping("/mensagem/")
	public class MensagemController {
	
	  private MensagemService mensagemService;
	  // Source -> Generate Constructor using Fields...

	  public MensagemController(MensagemService mensagemService) {
		 this.mensagemService = mensagemService;
	  }

	  @GetMapping("findAll")
	  public ResponseEntity<List<Mensagem>> findAll(){
		List<Mensagem> mensagems = mensagemService.findAll();
		
		return new ResponseEntity<List<Mensagem>>
						(mensagems, HttpStatus.OK);
		
	  }
	
		@PostMapping("create")
		public ResponseEntity<Mensagem> create(@RequestBody Mensagem mensagem) {

			Mensagem _mensagem = mensagemService.create(mensagem);

			return new ResponseEntity<Mensagem>(_mensagem, HttpStatus.OK);

		}

	
	  
	}

