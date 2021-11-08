package br.ufg.inf.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.ufg.inf.entities.Hotel;
import br.ufg.inf.exceptions.HotelException;

public class HotelDao {
    EntityManager em;

    public HotelDao(EntityManager em) {
        this.em = em;
    }

    public List<Hotel> findAll() {
        String sql = "FROM Hotel";
        TypedQuery<Hotel> hoteisQuery = em.createQuery(sql, Hotel.class);
        return hoteisQuery.getResultList();
    }

    public Hotel findById(Integer id) {
        return em.find(Hotel.class, id);
    }

    public Hotel insert(Hotel hotel) throws HotelException {
        try {
            em.getTransaction().begin();
            em.persist(hotel);
            em.getTransaction().commit();

            return hotel;
        } catch (Exception e) {
            throw new HotelException("Ação inesperada! Nenhuma linha foi alterada; " + e.getMessage());
        }
    }

    public Hotel update(Hotel hotel) throws HotelException {
        try {
            this.em.getTransaction().begin();
            this.em.persist(hotel);
            this.em.getTransaction().commit();
            return hotel;
        } catch (Exception e) {
            throw new HotelException("Ação inesperada! Nenhuma linha foi alterada." + e.getMessage());
        }
    }

    public Hotel delete(Integer id) throws HotelException {
        Hotel hotel = findById(id);
        try {
            this.em.getTransaction().begin();
            this.em.remove(hotel);
            this.em.getTransaction().commit();
            return hotel;
        } catch (Exception e) {
            throw new HotelException("Ação inesperada! Nenhuma linha foi excluída." + e.getMessage());
        }
    }
}