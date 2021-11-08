package br.ufg.inf.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_hotel")
public class Hotel implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_hotel")
    private Integer idHotel;

    @Column(name = "nm_hotel")
    private String nmHotel;

    private String endereco;

    @Column(name = "qtd_estrelas")
    private Integer qtdEstrelas;

    public Hotel() { }

    public Hotel(Integer idHotel) {
        this.idHotel = idHotel;
    }

    public Hotel(String nmHotel, String endereco, Integer qtdEstrelas) {
        this.nmHotel = nmHotel;
        this.endereco = endereco;
        this.qtdEstrelas = qtdEstrelas;
    }

    public Hotel(Integer idHotel, String nmHotel, String endereco, Integer qtdEstrelas) {
        this.idHotel = idHotel;
        this.nmHotel = nmHotel;
        this.endereco = endereco;
        this.qtdEstrelas = qtdEstrelas;
    }

    public void setIdHotel(Integer idHotel) {
        this.idHotel = idHotel;
    }

    public Integer getIdHotel() {
        return idHotel;
    }

    public void setNmHotel(String nmHotel) {
        this.nmHotel = nmHotel;
    }

    public String getNmHotel() {
        return nmHotel;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setQtdEstrelas(Integer qtdEstrelas) {
        this.qtdEstrelas = qtdEstrelas;
    }

    public Integer getQtdEstrelas() {
        return qtdEstrelas;
    }

    @Override
    public String toString() {
        return "Hotel [idHotel=" + idHotel + ", nmHotel=" + nmHotel + ", endereco=" + endereco + ", qtdEstrelas="
				+ qtdEstrelas + "]";
    }
}
