package br.ufg.inf.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DaoFactory {
    static EntityManagerFactory emf;
    static EntityManager em;

    public static EntityManager getEm() {
        if (em == null) {
            emf = Persistence.createEntityManagerFactory("semana03");
            em = emf.createEntityManager();
        }
        return em;
    }

    public static void CloseConnection() {
        if (em.isOpen()) 
            em.close();
    }
}
