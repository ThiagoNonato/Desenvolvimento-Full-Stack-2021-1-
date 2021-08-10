package br.ufg.inf.fs.entities;

public class Hospede {

	private Integer idHospede;
	private String nmHospede;
	private Integer fone;
	
	public Hotel() {
		super();
	}

	public Hotel(Integer idHospede, String nmHospede, Integer fone) {
		super();
		this.idHospede = idHospede;
		this.nmHospede = nmHospede;
		this.fone = qtdfone;
	}

	public Integer getIdHospede() {
		return idHospede;
	}

	public void setIdHospede(Integer idHospede) {
		this.idHospede = idHospede;
	}

	public String getNmHospede() {
		return nmHospede;
	}

	public void setNmHospede(String nmHospede) {
		this.nmHospede = nmHospede;
	}


	public void setfone (Integer fone) {
		this.fone = fone;
	}

	public String getFone() {
		return fone;
	}	

	@Override
	public String toString() {
		return "Hospede [idHospede=" + idHospede + ", nmHospede =" + nmHospede + ", fone=" + fone + "]";
	}
	
}
