package br.com.tmvendas.dao;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import br.com.tmvendas.modelo.Funcionario;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.classic.Session;


public class FuncionarioDAO {
    Session sessao = null;

    public void add(Funcionario funcionario) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        sessao.save(funcionario);
        sessao.getTransaction().commit();
        sessao.close();
    }

    public Funcionario getFuncionarioById(Long id) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        Funcionario funcionario = (Funcionario) sessao.get(Funcionario.class, id);
        sessao.getTransaction().commit();
        sessao.close();
        return funcionario;
    }
    
    public void update (Funcionario funcionario){
        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        sessao.update(funcionario);
        sessao.getTransaction().commit();
        sessao.close();
    }

    public List<Funcionario> list() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        List<Funcionario> lista = new ArrayList<Funcionario>();
        lista = sessao.createQuery("from Pessoa where DTYPE = 'Funcionario'").list();
        sessao.getTransaction().commit();
        sessao.close();
        return lista;
    }
    
    

    public boolean remove(Funcionario funcionario) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        sessao.delete(funcionario);
        sessao.getTransaction().commit();
        sessao.close();
        return true;
    }
}
