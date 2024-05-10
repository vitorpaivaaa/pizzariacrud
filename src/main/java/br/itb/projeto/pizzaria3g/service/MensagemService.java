package br.itb.projeto.pizzaria3g.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import br.itb.projeto.pizzaria3g.model.entity.Mensagem;
import br.itb.projeto.pizzaria3g.model.repository.MensagemRepository;
import jakarta.transaction.Transactional;

@Service
	public class MensagemService {

	  private MensagemRepository mensagemRepository;
	  // Source -> Generate Constructor using Fields...

	  public MensagemService(MensagemRepository mensagemRepository) {
		 this.mensagemRepository = mensagemRepository;
	  }

	  public List<Mensagem> findAll() {
		List<Mensagem> mensagems = mensagemRepository.findAll();
		return mensagems;
	  }
	  @Transactional
		public Mensagem create(Mensagem mensagem) {
		  
		  mensagem.setDataMensagem(LocalDateTime.now());
		  mensagem.setStatusMensagem("ATIVO");
			return mensagemRepository.save(mensagem);
		}

	}

