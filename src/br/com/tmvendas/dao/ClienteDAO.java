/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tmvendas.dao;

import br.com.tmvendas.modelo.Cliente;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.classic.Session;



public class ClienteDAO {

    Session sessao = null;

    public void add(Cliente cliente) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        sessao.save(cliente);
        sessao.getTransaction().commit();
        sessao.close();
    }

    public Cliente getClienteById(Long id) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        Cliente cliente = (Cliente) sessao.get(Cliente.class, id);
        sessao.getTransaction().commit();
        sessao.close();
        return cliente;
    }
    
    public void update (Cliente cliente){
        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        sessao.update(cliente);
        sessao.getTransaction().commit();
        sessao.close();
    }

    public List<Cliente> list() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        List<Cliente> lista = new ArrayList<Cliente>();
        lista = sessao.createQuery("from Pessoa where DTYPE = 'Cliente'").list();
        sessao.getTransaction().commit();
        sessao.close();
        return lista;
    }

    public boolean remove(Cliente cliente) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        sessao.delete(cliente);
        sessao.getTransaction().commit();
        sessao.close();
        return true;
    }
}
