package br.com.ronan.semana04.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ronan.semana04.domain.Hospedagem;

public interface HospedagemRepository extends JpaRepository<Hospedagem, Integer>{
    
}
