package br.ufg.inf.business;

import java.util.List;

import br.ufg.inf.config.DaoFactory;
import br.ufg.inf.dao.HospedagemDao;
import br.ufg.inf.entities.Hospedagem;
import br.ufg.inf.exceptions.HospedagemException;

public class HospedagemBusiness {
    HospedagemDao dao = new HospedagemDao(DaoFactory.getEm());

    public List<Hospedagem> findAll() throws HospedagemException {
        return dao.findAll();
    }

    public Hospedagem findById(Integer id) throws HospedagemException {
        return dao.findById(id);
    }

    public Hospedagem insert(Hospedagem hospedagem) throws HospedagemException {
        return dao.insert(hospedagem);
    }

    public Hospedagem update(Hospedagem hospedagem) throws HospedagemException {
        return dao.update(hospedagem);
    }

    public void delete(Integer id) throws HospedagemException {
        dao.delete(id);
    }
}
