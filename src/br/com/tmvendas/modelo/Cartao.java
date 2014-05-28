package br.com.tmvendas.modelo;

import javax.xml.crypto.Data;

public class Cartao {

	private String numero;
	private String nome;
	private Data validade;
	private String bandeira;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Data getValidade() {
		return validade;
	}

	public void setValidade(Data validade) {
		this.validade = validade;
	}

	public String getBandeira() {
		return bandeira;
	}

	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}

}
