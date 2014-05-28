/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tmvendas.dao;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    
    static {
        try {
            AnnotationConfiguration cfg = new AnnotationConfiguration();
            cfg.configure("hibernate.cfg.xml");
            sessionFactory = cfg.buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
