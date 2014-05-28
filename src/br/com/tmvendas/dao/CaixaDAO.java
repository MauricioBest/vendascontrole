package br.com.tmvendas.dao;

import br.com.tmvendas.modelo.Caixa;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.classic.Session;

public class CaixaDAO {
        Session sessao = null;

    public void add(Caixa caixa) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        sessao.save(caixa);
        sessao.getTransaction().commit();
        sessao.close();
    }

    public Caixa getClienteById(Long id) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        Caixa caixa = (Caixa) sessao.get(Caixa.class, id);
        sessao.getTransaction().commit();
        sessao.close();
        return caixa;
    }
    
    public void update (Caixa caixa){
        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        sessao.update(caixa);
        sessao.getTransaction().commit();
        sessao.close();
    }

    public List<Caixa> list() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        List<Caixa> lista = new ArrayList<Caixa>();
        lista = sessao.createQuery("from Caixa").list();
        sessao.getTransaction().commit();
        sessao.close();
        return lista;
    }

    public boolean remove(Caixa caixa) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        sessao.delete(caixa);
        sessao.getTransaction().commit();
        sessao.close();
        return true;
    }

}
