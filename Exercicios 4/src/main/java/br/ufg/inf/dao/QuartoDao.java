package br.ufg.inf.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.ufg.inf.entities.Quarto;
import br.ufg.inf.exceptions.QuartoException;

public class QuartoDao {
    EntityManager em;

    public QuartoDao(EntityManager em) {
        this.em = em;
    }

    public List<Quarto> findAll() {
        String sql = "FROM Quarto";
        TypedQuery<Quarto> quartosQuery = em.createQuery(sql, Quarto.class);
        return quartosQuery.getResultList();
    }

    public Quarto findById(Integer id) {
        return em.find(Quarto.class, id);
    }

    public Quarto insert(Quarto quarto) throws QuartoException {
        try {
            em.getTransaction().begin();
            em.persist(quarto);
            em.getTransaction().commit();

            return quarto;
        } catch (Exception e) {
            throw new QuartoException("Ação inesperada! Nenhuma linha foi alterada; " + e.getMessage());
        }
    }

    public Quarto update(Quarto quarto) throws QuartoException {
        try {
            this.em.getTransaction().begin();
            this.em.persist(quarto);
            this.em.getTransaction().commit();
            return quarto;
        } catch (Exception e) {
            throw new QuartoException("Ação inesperada! Nenhuma linha foi alterada; " + e.getMessage());
        }
    }

    public Quarto delete(Integer id) throws QuartoException {
        Quarto quarto = findById(id);
        try {
            this.em.getTransaction().begin();
            this.em.remove(quarto);
            this.em.getTransaction().commit();
            return quarto;
        } catch (Exception e) {
            throw new QuartoException("Ação inesperada! Nenhuma linha foi excluída; " + e.getMessage());
        }
    }
}
