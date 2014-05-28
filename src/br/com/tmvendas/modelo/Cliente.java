package br.com.tmvendas.modelo;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Cliente")
public class Cliente extends Pessoa {

    private Long cartao;
    @OneToMany
    private List<Compra> compras;

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }

    public Long getCartao() {
        return cartao;
    }

    public void setCartao(Long cartao) {
        this.cartao = cartao;
    }

    public String toString() {
        return super.getNome();
    }
}
