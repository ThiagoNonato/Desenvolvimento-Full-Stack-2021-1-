package br.ufg.inf.fs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.ufg.inf.fs.entities.Hospedagem;
import br.ufg.inf.fs.exceptions.HospedagemException;

public class HospedagemDao {
	Connection conn;
	
	public HospedagemDao(Connection conn) {
		this.conn = conn;
	}
	
	public List<Hospedagem> findAll() throws HospedagemException{
		
		List<Hospedagem> retorno = new ArrayList<Hospedagem>();
		ResultSet rs = null;
		PreparedStatement st = null;
		try {
			String sql = "SELECT id_hospede, hospede, fone FROM db_Hospedagem.tb_Hospedagem ";
			st = conn.prepareStatement(sql);
			rs = st.executeQuery();
			while(rs.next()){
				Hospedagem Hospedagem = new Hospedagem(
						rs.getInt("id_hospede"),
                                                new Hospede(rs.getInt("id_hospede"), null, null, null), 

				retorno.add(hospedagem);
			}
		}catch (SQLException e) {
			throw new HospedagemException("Erro no banco de dados: "+e.getMessage());
		}finally {
			DB.closeStatment(st);
			DB.closeResultSet(rs);
		}
		return retorno;
	}
	
	public Hospedagem findById(Integer id) throws HospedagemException{
		
		Hospedagem retorno = new Hospedagem();
		ResultSet rs = null;
		PreparedStatement st = null;
		try {
			String sql = "SELECT id_hospedagem, id_hospede FROM db_hospedagem.tb_hospedagem WHERE id_hospedagem = "+id;
			st = conn.prepareStatement(sql);
			rs = st.executeQuery();
			if(rs.next()){
				retorno = new Hospedagem(
						rs.getInt("id_hospede"), 
						new Hospede(rs.getInt("id_hospede"), null, null, null),
			}
		}catch (SQLException e) {
			throw new HospedagemException("Erro no banco de dados: "+e.getMessage());
		}finally {
			DB.closeStatment(st);
			DB.closeResultSet(rs);
		}
		return retorno;
	}
	
public Hospedagem insert(Hospedagem hospedagem) throws HospedeException {
		
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(" "
					+ "INSERT INTO tb_hospedagem "
					+ "(nm_ospedagem, fone) "
					+ "VALUES (?, ?, ?)",
			Statement.RETURN_GENERATED_KEYS);
			st.setString(1, hospedagem.getNmhospedagem());
			st.setInt(2, hospedagem.getFone());
			int rowsAffected = st.executeUpdate();
			if(rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				if(rs.next()) {
					hospede.setIdHospedagem(rs.getInt(1));
				}
			}else {
				throw new HospedagemException("Ação inesperada! Nenhuma linha foi inserida.");
			}
		}
		catch (SQLException e) {
			throw new HospedagemException("Erro no banco de dados: "+e.getMessage());
		}finally {
			DB.closeStatment(st);
		}
		return hospedagem;
	}

	public Hospedagem update(Hospedagem hospedagem) throws HospedagemException {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(" "
					+ "UPDATE tb_hospedagem "
					+ "SET nm_hospedagem = ?, fone = ? "
					+ "WHERE id_hospedagem = ? ");
			
			st.setString(1, hospedagem.getNmHospedagem());
			st.executeUpdate();
		}
		catch (SQLException e) {
			throw new HospedagemException("Erro no banco de dados: "+e.getMessage());
		}finally {
			DB.closeStatment(st);
		}
		return hospedagem;
	}
	
	
	public void delete(Integer id) throws HospedagemException {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(
				"DELETE FROM tb_hospedagem WHERE id_hospedagem = ?");
			st.setInt(1, id);
			st.executeUpdate();
		}
		catch (SQLException e) {
			throw new HospedagemException("Erro no banco de dados: "+e.getMessage());
		} 
		finally {
			DB.closeStatment(st);
		}
	}
}
