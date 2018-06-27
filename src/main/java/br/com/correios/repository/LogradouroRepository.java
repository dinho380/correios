package br.com.correios.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.correios.dto.LogradouroDTO;
import br.com.correios.model.Logradouro;

public interface LogradouroRepository extends JpaRepository<Logradouro, Long>{
    
	@Query("Select  new br.com.correios.dto.LogradouroDTO(l.nome, l.bairro.nome, concat(l.bairro.cidade.nome, '/', l.bairro.cidade.estado.uf), l.cep) from Logradouro l where l.cep = :parametro or l.nome like concat('%',:parametro,'%')")   // passando parametros de busca "JPQL"
	List<LogradouroDTO> buscaPorNomeLogradouroOuCep(@Param ("parametro") String parametro);
}
