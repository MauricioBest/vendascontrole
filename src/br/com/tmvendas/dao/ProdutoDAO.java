package br.com.tmvendas.dao;

import br.com.tmvendas.modelo.Produto;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.classic.Session;

public class ProdutoDAO {

    Session sessao = null;

    public void add(Produto produto) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        sessao.save(produto);
        sessao.getTransaction().commit();
        sessao.close();
    }

    public Produto getProdutoById(Long id) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        Produto produto = (Produto) sessao.get(Produto.class, id);
        sessao.getTransaction().commit();
        sessao.close();
        return produto;
    }

    public void update(Produto produto) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        sessao.update(produto);
        sessao.getTransaction().commit();
        sessao.close();
    }

    public List<Produto> list() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        List<Produto> lista = new ArrayList<Produto>();
        lista = sessao.createQuery("from Produto").list();
        sessao.getTransaction().commit();
        sessao.close();
        return lista;
    }

    public boolean remove(Produto produto) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        sessao.delete(produto);
        sessao.getTransaction().commit();
        sessao.close();
        return true;
    }
}