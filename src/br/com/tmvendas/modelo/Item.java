package br.com.tmvendas.modelo;

public class Item {

	private int codigo;
	private double precoParcial;
	private int quantidade;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPrecoParcial() {
		return precoParcial;
	}

	public void setPrecoParcial(double precoParcial) {
		this.precoParcial = precoParcial;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
