/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tmvendas.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author Mauricio
 */
@Entity
public class Compra {
	
        @Id
        @GeneratedValue
        private Long ID;
        @OneToOne
	private Produto produto;
	private String formaDePagamento;
        @ManyToOne
        private Cliente cliente;
	private static double valorTotal = 0;

        public Compra() {
        }

   
	
	
	
	public Compra(Produto produto, Cliente cliente,String formaDePagamento) {
                this.produto = produto;
		this.cliente = cliente;
                this.formaDePagamento = formaDePagamento;
//		this.valorTotal = this.valorTotal+produto.getPreco();
	}

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
	
	
//	public static double getValorTotal() {
//		return valorTotal;
//	}
//	public void setValorTotal(double valorTotal) {
//		this.valorTotal = valorTotal;
//	}

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

}