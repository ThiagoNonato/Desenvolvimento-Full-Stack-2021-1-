package br.ufg.inf.ctrl;

import java.util.ArrayList;
import java.util.List;

import br.ufg.inf.business.QuartoBusiness;
import br.ufg.inf.entities.Quarto;
import br.ufg.inf.exceptions.QuartoException;

public class QuartoCtrl {
    QuartoBusiness business = new QuartoBusiness();

    public List<Quarto> findAll() {
        List<Quarto> retorno = new ArrayList<Quarto>();
        try {
            retorno = business.findAll();
        } catch (QuartoException e) {
            System.err.println(e.getMessage());
        }

        return retorno;
    }

    public Quarto findById(Integer id) {
        Quarto retorno = new Quarto();
        try {
            retorno = business.findById(id);
        } catch (QuartoException e) {
            System.err.println(e.getMessage());
        }

        return retorno;
    }

    public Quarto insert(Quarto quarto) {
        try {
            quarto = business.insert(quarto);
        } catch (QuartoException e) {
            System.err.println(e.getMessage());
        }

        return quarto;
    }

    public Quarto update(Quarto quarto) {
        try {
            quarto = business.update(quarto);
        } catch (QuartoException e) {
            System.err.println(e.getMessage());
        }

        return quarto;
    }

    public void delete(Integer id) {
        try {
            business.delete(id);
        } catch (QuartoException e) {
            System.err.println(e.getMessage());
        }
    }
}
