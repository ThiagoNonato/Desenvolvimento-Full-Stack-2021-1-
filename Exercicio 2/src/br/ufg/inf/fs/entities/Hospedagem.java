package br.ufg.inf.fs.entities;

public class Hospedagem {

	private Integer idHospedagem;
	private Hospede hospede;
	
	public Hospedagem() {
		super();
	}

	public Hospedagem(Integer idHospedagem, Hospede hospede) {
		super();
		this.idHospedagem = idHospedagem;
		this.hospede = hospede;
	}

	public Integer getIdHospedagem() {
		return idHospedagem;
	}

	public void setIdHospedagem(Integer idHospedagem) {
		this.idHHospedagem = idHospedagem;
	}

	public Hospede getHospede() {
		return hospede;
	}

	public void setHospede(Hospede hospede) {
		this.hospede = hospede;
	}



	@Override
	public String toString() {
		return "Hospedagem [idHospedagem=" + idHospedagem + ", hospede =" + hospede + "]";
	}
	
}
