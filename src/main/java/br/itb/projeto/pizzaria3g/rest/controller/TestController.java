package br.itb.projeto.pizzaria3g.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {
	
	@GetMapping("test")
	public String getTest() {
		return "Escreva a sua mensagem aqui!";
	}
			// END POINT
	@GetMapping("message")
	public String getMessage() {
		return "Outra mensagem";
	}
	
	@GetMapping("msg")
	public String getMsg() {
		return "Olá, Mundo!";
	}
}
