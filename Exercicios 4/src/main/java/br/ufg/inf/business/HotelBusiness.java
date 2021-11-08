package br.ufg.inf.business;

import java.util.List;

import br.ufg.inf.config.DaoFactory;
import br.ufg.inf.dao.HotelDao;
import br.ufg.inf.entities.Hotel;
import br.ufg.inf.exceptions.HotelException;

public class HotelBusiness {

    HotelDao dao = new HotelDao(DaoFactory.getEm());

    public List<Hotel> findAll() throws HotelException {
        return dao.findAll();
    }

    public Hotel findById(Integer id) throws HotelException {
        return dao.findById(id);
    }

    public Hotel insert(Hotel hotel) throws HotelException {
        return dao.insert(hotel);
    }

    public Hotel update(Hotel hotel) throws HotelException {
        return dao.update(hotel);
    }

    public void delete(Integer id) throws HotelException {
        dao.delete(id);
    }
}
