package br.com.tmvendas.dao;

import br.com.tmvendas.modelo.Compra;
import br.com.tmvendas.modelo.Produto;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.classic.Session;

public class CompraDAO {

    Session sessao = null;

    public void add(Compra compra) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        sessao.save(compra);
        sessao.getTransaction().commit();
        sessao.close();
    }

    public Compra getCompraById(Long id) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        Compra compra = (Compra) sessao.get(Compra.class, id);
        sessao.getTransaction().commit();
        sessao.close();
        return compra;
    }

    public void update(Compra compra) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        sessao.update(compra);
        sessao.getTransaction().commit();
        sessao.close();
    }

    public List<Compra> list() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        List<Compra> lista = new ArrayList<Compra>();
        lista = sessao.createQuery("from Compra").list();
        sessao.getTransaction().commit();
        sessao.close();
        return lista;
    }

    public boolean remove(Compra compra) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        sessao.delete(compra);
        sessao.getTransaction().commit();
        sessao.close();
        return true;
    }
}