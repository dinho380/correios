package br.com.correios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.correios.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{

}
