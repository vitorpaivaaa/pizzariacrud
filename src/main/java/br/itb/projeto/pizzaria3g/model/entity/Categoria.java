package br.itb.projeto.pizzaria3g.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


	@Entity
	@Table(name = "Categoria")
	public class Categoria {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		private String nome;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		// GERAR OS Getters and Setters

	}
