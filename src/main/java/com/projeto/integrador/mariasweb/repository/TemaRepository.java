package com.projeto.integrador.mariasweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.integrador.mariasweb.model.Tema;



public interface TemaRepository extends JpaRepository<Tema, Long> {
	public List<Tema> findAllByDescricaoContainingIgnoreCase(String Descricao);

}
