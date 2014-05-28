package br.com.tmvendas.modelo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Caixa {

        @Id
        @GeneratedValue
        private Long id;
        @OneToOne
	private Usuario usuario;
	private double valorInicialCaixa;
	private double valorTotal; // Valor no caixa menos o valor inicial contido
        @OneToMany
	private List<Cliente> clientes;
        @OneToMany
        private List<Venda> vendas;
        

        
        public Caixa(){
            clientes = new ArrayList();
        }
                
                
                
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public double getValorInicialCaixa() {
		return valorInicialCaixa;
	}

	public void setValorInicialCaixa(double valorInicialCaixa) {
		this.valorInicialCaixa = valorInicialCaixa;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

}
