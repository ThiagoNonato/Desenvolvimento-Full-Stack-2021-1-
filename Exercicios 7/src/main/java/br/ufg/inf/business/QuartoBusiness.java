package br.ufg.inf.business;

import java.util.List;

import br.ufg.inf.config.DaoFactory;
import br.ufg.inf.dao.QuartoDao;
import br.ufg.inf.entities.Quarto;
import br.ufg.inf.exceptions.QuartoException;

public class QuartoBusiness {
    
    QuartoDao dao = new QuartoDao(DaoFactory.getEm());

    public List<Quarto> findAll() throws QuartoException {
        return dao.findAll();
    }

    public Quarto findById(Integer id) throws QuartoException {
        return dao.findById(id);
    }

    public Quarto insert(Quarto quarto) throws QuartoException {
        return dao.insert(quarto);
    }

    public Quarto update(Quarto quarto) throws QuartoException {
        return dao.update(quarto);
    }

    public void delete(Integer id) throws QuartoException {
        dao.delete(id);
    }
}
