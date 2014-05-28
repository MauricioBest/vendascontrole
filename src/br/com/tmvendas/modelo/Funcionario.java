package br.com.tmvendas.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
public class Funcionario extends Pessoa {

        @OneToOne(optional = true, cascade = CascadeType.ALL)
        @JoinColumn(name = "codUsuario", referencedColumnName = "ID")
	private Usuario usuario;
	private double salario;
	private int cargaHoraria;

        public Usuario getUsuario() {
            return usuario;
        }

        public void setUsuario(Usuario usuario) {
            this.usuario = usuario;
        }

 


	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

}
