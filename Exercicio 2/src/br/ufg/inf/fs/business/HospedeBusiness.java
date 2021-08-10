package br.ufg.inf.fs.business;

import java.util.List;

import br.ufg.inf.fs.dao.DB;
import br.ufg.inf.fs.dao.HospedeDao;
import br.ufg.inf.fs.entities.Hospede;
import br.ufg.inf.fs.exceptions.HospedeException;

public class HospedeBusiness {

	
	HospedeDao dao = new HospedeDao(DB.getConnection());
	
	public List<Hospede> findAll() throws HospedeException{
		return dao.findAll();
	}
	
	public Hospede findById(Integer id) throws HospedeException{
		return dao.findById(id);
	}
	
	public Hospede insert(Hospede hospede) throws HospedeException {
		return dao.insert(hotel);
	}
	
	public Hospede update(Hospede hospede) throws HospedeException {
		return dao.update(hotel);
	}
	
	public void delete(Integer id) throws HospedeException {
		dao.delete(id);
	}
}
