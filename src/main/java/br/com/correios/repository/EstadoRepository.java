package br.com.correios.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.correios.dto.FaixaCepCidadeDTO;
import br.com.correios.dto.FaixaCepDTO;
import br.com.correios.model.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Long>{

	@Query("Select  new br.com.correios.dto.FaixaCepDTO(e.uf, e.faixaCep) from Estado e where e.id=:uF")
	List<FaixaCepDTO> buscaPorUF(@Param ("uF") Long uF);

	
	@Query("Select  new br.com.correios.dto.FaixaCepCidadeDTO(c.nome,c.situacao, c.tipoFaixa,c.faixaCepLocalidade) from Cidade c where c.estado.id=:uF and c.nome like concat(:localidade,'%') ")   // passando parametros de busca "JPQL"
	List<FaixaCepCidadeDTO> buscaPorUFeLocalidade(@Param ("uF") Long uF,@Param("localidade") String localidade);
		
	
	
	
	/*
 * 	@Query("Select  new br.com.correios.dto.FaixaCepDTO(c.estado.uf, c.estado.faixaCep,c.nome,c.situacao, c.tipoFaixa,c.faixaCepLocalidade) from Cidade c where c.estado.id=:uF and c.nome like concat('%',:localidade,'%') ")   // passando parametros de busca "JPQL"

 
	@Query("Select  new br.com.correios.dto.FaixaCepDTO(e.uf, e.faixaCep) from Estado e where e.id=:uF")   // passando parametros de busca "JPQL"
	List<FaixaCepDTO> buscaPorUF(@Param ("uF") Long uF,@Param("localidade") String localidade);
*/	
}
