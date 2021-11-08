package br.ufg.inf.business;

import java.util.List;

import br.ufg.inf.config.DaoFactory;
import br.ufg.inf.dao.HospedeDao;
import br.ufg.inf.entities.Hospede;
import br.ufg.inf.exceptions.HospedeException;

public class HospedeBusiness {
    HospedeDao dao = new HospedeDao(DaoFactory.getEm());

    public List<Hospede> findAll() throws HospedeException {
        return dao.findAll();
    }

    public Hospede findById(Integer id) throws HospedeException {
        return dao.findById(id);
    }

    public Hospede insert(Hospede hospede) throws HospedeException {
        return dao.insert(hospede);
    }

    public Hospede update(Hospede hospede) throws HospedeException {
        return dao.update(hospede);
    }

    public void delete(Integer id) throws HospedeException {
        dao.delete(id);
    }
}
