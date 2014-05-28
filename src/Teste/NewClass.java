/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import br.com.tmvendas.dao.HibernateUtil;
import org.hibernate.classic.Session;

/**
 *
 * @author Mauricio
 */
public class NewClass {
    
     public static void main(String[] args) {

       Session sessao = HibernateUtil.getSessionFactory().openSession();


    }
    
}
